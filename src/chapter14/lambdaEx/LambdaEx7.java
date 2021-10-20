package chapter14.lambdaEx;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main( String[] args ) {
        Function<String, Integer> f = s -> Integer.parseInt( s, 16 );
        // 단순 값을 넘겨주는 행위일 때, 거추장스러운 부분을 가볍게 잘라주기
        Function<Integer, String> g = Integer::toBinaryString;
//        Function<Integer, String> g = i -> Integer.toBinaryString( i );
        //  (T t) -> after.apply(apply(t));
        // andThen() 과 compose() param 으로 모두 Function 인터페이스를 넘겨준다
        Function<String, String> h1 = f.andThen( g );
        Function<Integer, Integer> h2 = f.compose( g );

        // h1 은 "FF" 를 16진법으로 표현하는걸 출력?
        System.out.println( h1.apply( "FF" ) );
        // 2 진법으로 나타낸 값을 16진수로 표현
        System.out.println( h2.apply( 2 ) );

        Function<String, String> f2 = x -> x; // 1:1 대응하는 함수 -> x와 y값이 동일한 그래프와 같다
        // "AAA"와 항상 대응하는 "AAA"가 출력
        System.out.println( f2.apply( "AAA" ) );

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        // i -> i < 100 . negate()
        // p 의 정반대 출력 -> !p
        Predicate<Integer> notP = p.negate();
        // !p 이고 q 또는 r 인 상태 확인
        Predicate<Integer> all = notP.and( q.or( r ) ); // 100이상이며 (200미만 혹은 짝수)
        System.out.println( all.test( 150 ) ); // 150은 위의 조건에 부합하는지 확인하는 메소드

        String str1 = "abc";
        String str2 = "abc";

        // p2 는 str1 과 값이 동일한지 확인
        Predicate<String> p2 = Predicate.isEqual( str1 );
        // boolean 형 result 를 통해 str1과 str2의 값이 동일한지 확인한다
        boolean result = p2.test( str2 );
        // 결과 true!
        System.out.println( result );
    }
}
