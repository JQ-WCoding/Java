package chapter14.streamEx;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main( String[] args ) {
        Student[] students = {
                new Student( "Lee", 3, 300 ),
                new Student( "Kim", 2, 100 ),
                new Student( "Park", 1, 200 ),
                new Student( "Jo", 2, 250 ),
                new Student( "Kang", 3, 350 ),
                new Student( "So", 1, 150 )
        };

        List<String> names = Stream.of( students ).map( Student::getName ) // getName()을 통해 이름 가져오기
                .collect( Collectors.toList() ); // collectors 클래스의 list 로 변환 메소드 사용
        System.out.println( names );

        // students 를 배열로 전환
        Student[] students2 = Stream.of( students ).toArray( Student[]::new );

        for (Student s : students2) {
            System.out.println( s );
        }

        // Map<> 참조변수로 이름과 value 를 students 배열에서 가져온다
        Map<String, Student> studentMap =
                Stream.of( students ).collect( Collectors.toMap( s -> s.getName(), p -> p ) );

        for (String name : studentMap.keySet()) {
            // 키 값을 가져오면 해당 키값에 맞는 value 를 각각 get()을 통해 가져와 출력한다
            System.out.println( name + " - " + studentMap.get( name ) );
        }

        long count = Stream.of( students ).count();
//        long count = Stream.of( students ).collect( Collectors.counting() );

        long total = Stream.of( students ).mapToLong( Student::getTotal ).sum();
//        long total = Stream.of( students ).collect( Collectors.summingInt( Student::getTotal ) );
        System.out.println( "count : " + count );
        System.out.println( "total : " + total );

        // 총 값에서 -> sum 을 통해 모두 더한 값
        total = Stream.of( students ).map( Student::getTotal ).reduce( 0, Integer::sum );
//        total = Stream.of( students ).collect( Collectors.reducing( 0, Student::getTotal, Integer::sum ) );
        System.out.println( total );

        // max 값 -> total 값 비교해서 int 형으로 반환한 값중 최대 값 반환
        Optional<Student> topStudent = Stream.of( students ).max( Comparator.comparingInt( Student::getTotal ) );
//        Optional<Student> topStudent = Stream.of(students).collect( Collectors.maxBy( Comparator.comparingInt( Student::getTotal ) ) );
        System.out.println( "topStudent : " + topStudent );

        // 총값을 정리해서 int 형으로 반환
        IntSummaryStatistics statistics = Stream.of( students ).collect( Collectors.summarizingInt( Student::getTotal ) );
        // 해당 값에 초기화된 모든 결과값 출력
        System.out.println( "statics : " + statistics );

        // {} 사이에 값을 넣으며 구분자는 ',' 를 이용해 간격을 나눈다 -> 이름을 가져와 mapping
        // 정렬도 추가해 보았음
        String studentNames = Stream.of( students ).map( Student::getName ).sorted().collect( Collectors.joining( ",", "{", "}" ) );
        System.out.println(studentNames);
    }
}
