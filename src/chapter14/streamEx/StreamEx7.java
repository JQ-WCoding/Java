package chapter14.streamEx;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx7 {
    public static void main( String[] args ) {
        StudentGender[] students = {
                new StudentGender( "Lee", true, 1, 1, 400 ),
                new StudentGender( "Kim", true, 1, 1, 100 ),
                new StudentGender( "Park", false, 1, 2, 90 ),
                new StudentGender( "Song", false, 1, 2, 70 ),
                new StudentGender( "Go", true, 1, 3, 200 ),

                new StudentGender( "Kang", true, 2, 1, 100 ),
                new StudentGender( "Choi", false, 2, 2, 150 ),
                new StudentGender( "Han", true, 2, 3, 400 ),
                new StudentGender( "Yoon", false, 2, 3, 70 ),
        };
        System.out.println( "1. 단순분할 : " );

        Map<Boolean, List<StudentGender>> studentByGender =
                Stream.of( students ).collect( Collectors.partitioningBy( StudentGender::isMale ) ); // isMale 값에 따라 구분해서 컬렉션으로 값 입력

        // true 값을 가진 값 초기화
        List<StudentGender> male = studentByGender.get( true );
        // false 값을 가진 값 초기화
        List<StudentGender> female = studentByGender.get( false );

        // 남학생 / 여학생 출력
        System.out.println( "남학생" );
        for (StudentGender sg : male) {
            System.out.println( sg );
        }
        System.out.println( "여학생" );
        for (StudentGender sg : female) {
            System.out.println( sg );
        }

        System.out.println( "2. 단순분할 + 통계(성별 학생수)" );

        // isMale 을 구분점으로 나눈 값을 counting 한 값 초기화
        Map<Boolean, Long> studentNumByGender =
                Stream.of( students ).collect( Collectors.partitioningBy( StudentGender::isMale, Collectors.counting() ) );

        // true : 남학생 / false : 여학생
        System.out.println( "남학생 수 : " + studentNumByGender.get( true ) );
        System.out.println( "여학생 수 : " + studentNumByGender.get( false ) );

        System.out.println( "3. 단순분할 + 통계(성별 1등)" );
        Map<Boolean, Optional<StudentGender>> topScoreByGender =
                Stream.of( students )
                        // isMale() 을 기준점으로 둔다
                        .collect( Collectors.partitioningBy( StudentGender::isMale,
                                // maxBy()를 통해 최대값 구하기 -> score 값 비교해서 그 중 최대값 구하기
                                Collectors.maxBy( Comparator.comparingInt( StudentGender::getScore ) )
                        ) );
        System.out.println( "남학생 1등 : " + topScoreByGender.get( true ) );
        System.out.println( "여학생 1등 : " + topScoreByGender.get( false ) );

        Map<Boolean, StudentGender> topScoreByGender2 =
                Stream.of( students ).collect( Collectors.partitioningBy( StudentGender::isMale,
                        Collectors.collectingAndThen(
                                Collectors.maxBy( Comparator.comparingInt( StudentGender::getScore ) ), Optional::get // Optional::get 을 통해 전부 가져온다?
                        ) )
                );
        // 구분하는 다른 방법
        System.out.println( "남학생 1등 : " + topScoreByGender2.get( true ) );
        System.out.println( "여학생 1등 : " + topScoreByGender2.get( false ) );

        System.out.println( "4. 다중분할 (성별 불합격자, 100점 이하)" );

        // 기준 점수 이하 값 초기화
        Map<Boolean, Map<Boolean, List<StudentGender>>> failedStuByGender =
                Stream.of( students ).collect( Collectors.partitioningBy( StudentGender::isMale,
                        Collectors.partitioningBy( s -> s.getScore() <= 100 ) ) );

        // gender 의 true / false 구분 후 -> 점수 이하인지 구분을 위한 true / false 구분
        List<StudentGender> failedMale = failedStuByGender.get( true ).get( true );
        List<StudentGender> failedFemale = failedStuByGender.get( false ).get( true );

        for (StudentGender sg : failedMale) System.out.println(sg);

        for (StudentGender sg : failedFemale) System.out.println(sg);
    }
}
