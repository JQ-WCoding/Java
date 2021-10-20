package chapter14.streamEx;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {
    public static void main( String[] args ) {
        Optional<String> optStr = Optional.of( "abcde" );
        Optional<Integer> optInt = optStr.map( String::length );
        // get() 메소드는 생성자와 함께 만들어진 값을 반환해주는 메소드
        System.out.println( "optStr : " + optStr.get() );
        System.out.println( "optInt : " + optInt.get() );

        // result1은 Optional 의 123에서 길이가 0보다 크면 -> 값이 존재한다면
        // int 형으로 mapping 한 값을 반환 받아 초기호 한다
        int result1 = Optional.of( "123" ).filter( x -> x.length() > 0 )
                .map( Integer::parseInt ).get();

        // 0보다 작은 값이라면 String 값이 없다 -> map().orElse() 를 통해 없는 경우 -1을 반환
        int result2 = Optional.of( "" ).filter( x -> x.length() > 0 )
                .map( Integer::parseInt ).orElse( -1 );

        System.out.println( "result1 : " + result1 );
        System.out.println( "result2 : " + result2 );

        // 456 int 형으로 파싱 -> result3 은 해당 값 입력 '456'
        Optional.of( "456" ).map( Integer::parseInt )
                .ifPresent( x -> System.out.printf( "result3 : %d%n", x ) );

        OptionalInt optInt1 = OptionalInt.of( 0 ); // 0 인 값을 저장
        OptionalInt optInt2 = OptionalInt.empty(); // null

        System.out.println( optInt1.isPresent() );
        System.out.println( optInt2.isPresent() );

        System.out.println( optInt1.getAsInt() ); // int 형으로 표현하기 -> 0
//        System.out.println(optInt2.getAsInt());  present 값이 false 이기 때문에 예외처리
        System.out.println( "optInt1 : " + optInt1 ); // -> 값이 들어있어 배열 하나를 표현
        System.out.println( "optInt2 : " + optInt2 ); // -> 값이 없이 .empty 로 표현
        // 값이 같은가 ? -> 다르다 null 과 0
        System.out.println( "optInt1.equals(optInt2) ? " + optInt1.equals( optInt2 ) );

        Optional<String> opt1 = Optional.ofNullable( null ); // null 값 저장
        Optional<String> opt2 = Optional.empty(); // 빈 객체
        // 같은 표현

        System.out.println( "opt1 : " + opt1 );
        System.out.println( "opt2 : " + opt2 );
        // null 또한 값 자체가 존재하지 않는다는 의미이다. 따라서, empty() 메소드로 빈 객체를 생성하는 것과 null 값을 통해 객체를 생성해도 동일하게 아무 값이 들어가있지 않다
        System.out.println( "opt1.equals(opt2) ? " + opt1.equals( opt2 ) );

        int result3 = optStringToInt( Optional.of( "123" ), 0 );
        int result4 = optStringToInt( Optional.of( "" ), 0 );

        // 값이 존재해서 들어가면 해당 값 출력
        System.out.println("result3 : " + result3);
        // 값이 없으면 default 값인 0으로 반환되어 값 출력한다
        System.out.println("result4 : " + result4);
    }

    static int optStringToInt( Optional<String> opt, int defaultVal ) {
        try {
            return opt.map( Integer::parseInt ).get();
        } catch (Exception e) {
            return defaultVal;
        }
    }
}
