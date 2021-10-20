package chapter14.streamEx;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main( String[] args ) {
        String[] arr = {
                "C", "Java", "Python", "JavaScript", "SQL"
        };

        // arr 값 출력
        Stream.of( arr ).forEach( System.out::println );

        // arr 배열의 문자열 값중 길이가 0, 값이 없는 값이 없는가? -> nonMatch()
        boolean noEmptyStr = Stream.of( arr ).noneMatch( s -> s.length() == 0 );
        // word 변수는 첫번째 시작하는 단어가 'J' 로 시작하는 단어 중 가장 첫번째로 발견 -> 첫번째 인덱스인 값
        Optional<String> word = Stream.of( arr ).filter( s -> s.charAt( 0 ) == 'J' ).findFirst();

        System.out.println( "noEmptyStr : " + noEmptyStr );
        System.out.println( "word : " + word );

        // 같은 값 4개 만들기
        IntStream intStream1 = Stream.of( arr ).mapToInt( String::length );
        IntStream intStream2 = Stream.of( arr ).mapToInt( String::length );
        IntStream intStream3 = Stream.of( arr ).mapToInt( String::length );
        IntStream intStream4 = Stream.of( arr ).mapToInt( String::length );

        // 문자배열 개수
        int count = intStream1.reduce( 0, ( a, b ) -> a + 1 );
        // 총 문자의 수
        int sum = intStream2.reduce( 0, Integer::sum );
//        int sum = intStream2.reduce( 0, ( a, b ) -> a + b );

        // 문자열의 문자개수 중 가장 많은 값
        OptionalInt max = intStream3.reduce( Integer::max );
        // 문자열의 문자개수 중 가장 적은 값
        OptionalInt min = intStream4.reduce( Integer::min );

        System.out.println( "count : " + count );
        System.out.println( "sum : " + sum );
        System.out.println( "max : " + max.getAsInt() );
        System.out.println( "min : " + min.getAsInt() );
    }
}
