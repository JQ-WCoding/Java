package chapter14.streamEx;

import java.util.Arrays;
import java.util.stream.Stream;

public class CollectorEx1 {
    public static void main( String[] args ) {
        String[] arr = {
                "aaa", "bbb", "ccc"
        };
        // Stream 으로 arr 문자열 배열을 값을 초기화 한다
        Stream<String> stringStream = Stream.of( arr );

        // Stream String 으로 변환 -> 기준값은 ConcatCollector()를 사용한다
        String result = stringStream.collect( new ConcatCollector() );

        // arr -> 일반적인 배열 toString() 전환 방법
        System.out.println( Arrays.toString( arr ) );
        // result -> Collector 를 사용한 값 도출
        System.out.println( "result : " + result );
    }
}
