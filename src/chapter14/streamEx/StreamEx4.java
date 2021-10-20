package chapter14.streamEx;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main( String[] args ) {
        Stream<String[]> stream = Stream.of(
                new String[]{"aaa", "bbb", "ccc"},
                new String[]{"AAA", "BCC", "DCB"}
        );
        // strStream 변수는 상단의 문자배열 stream 을 일렬로 다시 mapping 한다 -> stream 을 Arrays 배열 클래스를 이용해서
        Stream<String> strStream = stream.flatMap( Arrays::stream );

        // 소문자로 전부 다시 mapping
        strStream.map( String::toLowerCase )
                // 중복 제거
                .distinct() // aaa 는 하나만 출력된다
                // 정렬
                .sorted()
                // 출력 반복문
                .forEach( System.out::println );
        System.out.println();

        String[] lines = {
                "Life is too short you need Python",
                "We've got too short tail"
        };

        Stream<String> lineStream = Arrays.stream( lines );
        // 두 배열을 뒤의 빈공간을 기준으로 나누어 저장하며
        lineStream.flatMap( line -> Stream.of( line.split( " +" ) ) )
                // 소문자로 맵핑
                .map( String::toLowerCase )
                // 중복 제거
                .distinct()
                // 정렬
                .sorted()
                // 출력 반목문
                .forEach( System.out::println );
        System.out.println();



        // Stream 을 다시 String[] 배열로 인스턴스화 한 부분을 mapping 후 -> 다시 소문자로 mapping 해서 출력 ? -> 재공부 필요
        Stream<String> strStream1 = Stream.of( "AAA", "BBb", "cCc", "DD" );
        Stream<String> strStream2 = Stream.of( "BBB", "aAA", "cCD", "dd" );

        Stream<Stream<String>> strStreamStr = Stream.of( strStream1, strStream2 );

        Stream<String> stringStream =
                strStreamStr.map( s -> s.toArray( String[]::new ) )
                        .flatMap( Arrays::stream );

        stringStream.map( String::toLowerCase )
                .distinct()
                .forEach( System.out::println );
    }
}
