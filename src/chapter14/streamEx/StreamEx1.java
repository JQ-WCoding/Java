package chapter14.streamEx;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main( String[] args ) {
        Stream<Student> studentStream = Stream.of(
                new Student( "Lee", 3, 300 ),
                new Student( "Kim", 2, 100 ),
                new Student( "Park", 1, 200 ),
                new Student( "Jo", 2, 250 ),
                new Student( "Kang", 3, 350 ),
                new Student( "So", 1, 150 )
        );

        // chain 형식
        // studentStream 을 정렬할 때, classNo 기준으로 정렬 후, 같은 값이라면 높은 값부터 다시 정렬을 한다
        // forEach()를 통해 반복문으로 각각 값을 출력한다
        studentStream.sorted( Comparator.comparing( Student::getClassNo ).thenComparing( Comparator.naturalOrder() ) ).forEach( System.out::println );

    }
}
