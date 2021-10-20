package chapter14.streamEx;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx8 {
    public static void main( String[] args ) {
        StudentGender[] students = {
                new StudentGender( "Lee", true, 1, 1, 200 ),
                new StudentGender( "Kim", true, 1, 1, 100 ),
                new StudentGender( "Park", false, 1, 2, 70 ),
                new StudentGender( "Song", false, 1, 2, 90 ),
                new StudentGender( "Go", true, 1, 3, 150 ),

                new StudentGender( "Kang", true, 2, 1, 199 ),
                new StudentGender( "Choi", false, 2, 2, 210 ),
                new StudentGender( "Han", true, 2, 3, 400 ),
                new StudentGender( "Yoon", false, 2, 3, 70 ),
        };
        System.out.println( "1. 단순그룹화(반별로 그룹화)" );
        Map<Integer, List<StudentGender>> studentsByGender =
                Stream.of( students ).collect( Collectors.groupingBy( StudentGender::getClassNo ) ); // 그룹핑은 반번호로 구분한다

        // studentsByGender.values() 값을 반복하면서
        for (List<StudentGender> classNo : studentsByGender.values()) {
            // classNo 에 따라 값을 출력한다
            for (StudentGender sg : classNo) {
                System.out.println( sg );
            }
            System.out.println( "--------" );
        }

        System.out.println( "2. 단순그룹화(성별로 그룹화)" );
        Map<Level, List<StudentGender>> studentByLevel =
                // 파라미터로 받은 값이
                Stream.of( students ).collect( Collectors.groupingBy( s -> {
                    // 200 100 이외의 값에 따라 enum 클래스의 high mid low 값을 반환한다
                    if (s.getScore() >= 200) {
                        return Level.HIGH;
                    } else if (s.getScore() >= 100) {
                        return Level.MID;
                    } else {
                        return Level.LOW;
                    }
                } ) );

        // TreeSet 참조타입으로 추상화 -> 값은 Level 을 기준으로 나눈 학생의 key 값을 기준으로 한다
        TreeSet<Level> treeSet = new TreeSet<>( studentByLevel.keySet() );

        // treeSet 변수의 값을 key 지칭하여
        for (Level key : treeSet) {
            // key 값이 무엇인지 출력하고
            System.out.println( "[" + key + "]" );

            // studentByLevel 의 key 값을 통해 value 를 출력하는 값을 반복해서 출력한다
            for (StudentGender sg : studentByLevel.get( key )) {
                System.out.println( sg );
            }
            System.out.println();
        }

        System.out.println( "3. 단순그룹화 + 통계(성적별 학생수)" );

        Map<Level, Long> studentCntByLevel =
                Stream.of( students ).collect( Collectors.groupingBy( s -> {
                    if (s.getScore() >= 200) {
                        return Level.HIGH;
                    } else if (s.getScore() >= 100) {
                        return Level.MID;
                    } else {
                        return Level.LOW;
                    }
                }, Collectors.counting() ) );
        // key 값을 통해 반복문 실행
        for (Level key : studentCntByLevel.keySet()) {
            // key 값과 key 값을 통해 value 를 찾은 값을 각각 String 형과 정수형으로 표현하여 출력한다
            System.out.printf( "[%s] - %d, ", key, studentCntByLevel.get( key ) );
        }
        System.out.println();

        System.out.println( "4. 다중그룹화(학년별, 반별)" );
        Map<Integer, Map<Integer, List<StudentGender>>> studentByGradeAndClass =
                Stream.of( students ).collect( Collectors.groupingBy(
                        // 반을 기준으로 그룹핑을 기준으로 학년을 그룹핑 한다 -> 해당 값을 collector 로 모아 값을 초기화
                        StudentGender::getGrade, Collectors.groupingBy( StudentGender::getClassNo ) ) );

        // 깊숙히 mapping 된 만큼 반복문이 많이 필요
        for (Map<Integer, List<StudentGender>> grade : studentByGradeAndClass.values()) {
            // 첫번째 map 구조에서 key 값을 통해 value 를 얻고
            // 그에 따른 value 값인 list 는 StudentGender 객체들을 가지고 있다
            for (List<StudentGender> classNo : grade.values()) {
                System.out.println();
                // 그 객체들을 전부 표현
                for (StudentGender sg : classNo) {
                    System.out.println( sg );
                }
            }
        }

        System.out.println( "5. 다중그룹화 + 통계(학년별, 반별 1등)" );
        Map<Integer, Map<Integer, StudentGender>> topStudentByGradeAndClass =
                Stream.of( students )
                        // 다시 학년을 기준으로 그룹짓기
                        .collect( Collectors.groupingBy( StudentGender::getGrade,
                                // classNo 를 기준으로 그룹짓는다
                                Collectors.groupingBy( StudentGender::getClassNo,
                                        Collectors.collectingAndThen(
                                                // 성적별로 비교해서 max 값 선정
                                                Collectors.maxBy( Comparator.comparingInt( StudentGender::getScore ) ), Optional::get
                                        ) ) ) );

        for (Map<Integer, StudentGender> grade : topStudentByGradeAndClass.values()) {
            for (StudentGender sg : grade.values()) {
                System.out.println( sg );
            }
        }

        System.out.println( "6. 다중그룹화 + 통계(학년별, 반별 성적그룹)" );
        // Set 은 중복 불가
        Map<String, Set<Level>> studentByScore =
                Stream.of( students )
                        .collect( Collectors.groupingBy( s -> s.getGrade() + " - " + s.getClassNo(),
                                Collectors.mapping( s -> {
                                    if (s.getScore() >= 200) return Level.HIGH;
                                    else if (s.getScore() >= 100) return Level.MID;
                                    else return Level.LOW;
                                }, Collectors.toSet() ) ) );

        Set<String> keySet = studentByScore.keySet();

        for (String key : keySet) {
            // Set key value 로 값 표현
            System.out.println( "[" + key + "]" + studentByScore.get( key ) );
        }
    }
}
