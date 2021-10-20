package chapter14.streamEx;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main( String[] args ) {
        Student[] students = {
                new Student( "Lee", 3, 300 ),
                new Student( "Kim", 2, 100 ),
                new Student( "Park", 1, 200 ),
                new Student( "Jo", 2, 250 ),
                new Student( "Kang", 3, 350 ),
                new Student( "So", 1, 150 )
        };

        Stream<Student> stream = Stream.of( students );

        stream.sorted( Comparator.comparing( Student::getClassNo )
                        .thenComparing( Comparator.naturalOrder() ) )
                .forEach( System.out::println );

        // 상단에서 한번 사용했기 때문에 재사용 불가능 -> 다시 초기화
        stream = Stream.of( students );
        // Student 의 total 값을 int 형으로 mapping
        IntStream scoreStream = stream.mapToInt( Student::getTotal );

        //    private long count;
        //    private long sum;
        //    private int min = Integer.MAX_VALUE;
        //    private int max = Integer.MIN_VALUE;
        // 와 같은 값들을 가지고 min max sum 등 총합 연산에 자주 사용되는 변수들과 메소드를 정의해둔 클래스
        IntSummaryStatistics statistics = scoreStream.summaryStatistics();

        // statics 는 각각 값들을 출력하기 위해 sout 사용
        // Stream 때와 같이 forEach() 출력문을 사용할 수 없다
        // private 접근제어자 변수들 getter 를 사용해 값 출력
        System.out.println( "count : " + statistics.getCount() );
        System.out.println( "sum : " + statistics.getSum() );
        System.out.printf( "average : %.2f%n" + statistics.getAverage() );
        System.out.println( "min : " + statistics.getMin() );
        System.out.println( "max : " + statistics.getMax() );
    }
}
