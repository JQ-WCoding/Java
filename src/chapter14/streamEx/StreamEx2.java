package chapter14.streamEx;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main( String[] args ) {
        File[] files = {new File( "Ex1.java" ), new File( "Ex1.bak" ),
                new File( "Ex2.java" ), new File( "Ex1" ), new File( "Ex1.txt" )};

        // Stream 인터페이스 타입으로 files 배열의 값들을 사용
        Stream<File> fileStream = Stream.of( files );

        Stream<String> fileNameStream = fileStream.map( File::getName ); // 모든 파일명을 가져와 mapping
        // 매핑된 file 명들 모두 출력
        fileNameStream.forEach( System.out::println );

        fileStream = Stream.of( files );

        fileStream.map( File::getName )
                // '.'의 위치가 1 이 아닌 경우의 filter
                .filter( s -> s.indexOf( '.' ) != 1 )
                // 해당 순번 1의 위치에 +1 한 값 -> index.txt 의 뒷부분 부터 잘라서 -> txt
                .map( s -> s.substring( s.indexOf( '.' ) + 1 ) )
                // mapping 대소문자 구분 없이 모두 대문자로 변경
                .map( String::toUpperCase )
                // distinct() 중복제거 후
                // forEach() 반복문을 통해 전부 출력
                .distinct().forEach( System.out::print );

        // fileNameStream 은 이미 한번 사용했기 때문에 사용 불가능
//        fileNameStream.filter( s -> s.indexOf( '.' ) != 1 )
//                .map( s -> s.substring( s.indexOf( '.' ) + 1 ) )
//                .map( String::toUpperCase )
//                .distinct().forEach( System.out::println );
    }
}
