package chapter14.lambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main( String[] args ) {
        // 각각 함수형 인터페이스를 재정의 하는 과정
        // 선언과 동시에 각각의 함수를 정의하여 표현하였다
        // get()
        Supplier<Integer> supplier = ( ) -> (int) ( Math.random() * 100 ) + 1; // 1 ~ 100 랜덤 숫자 설정
        // accept()
        Consumer<Integer> consumer = integer -> System.out.print( integer + ", " );
        // test()
        Predicate<Integer> predicate = integer -> integer % 2 == 0; // 짝수 홀수 확인
        // apply()
        Function<Integer, Integer> function = integer -> integer / 10 * 10; // 1의 자리 수 0으로 변경하는 방법
        // 10으로 나눴다 다시 10을 곱함으로 나머지 값 삭제
        // List 에도 <Integer>로 선언하여 초기화
        List<Integer> list = new ArrayList<>();
        makeRandomList( supplier, list );
        System.out.println( list );
        printEvenNum( predicate, consumer, list );
        // Function<Integer, Integer> 와 List<integer> 형으로 반환
        List<Integer> newList = doSomething( function, list );
        System.out.println( newList );
    }

    static <T> List<T> doSomething( Function<T, T> f, List<T> l ) {
        // 멤버 변수로 ArrayList 를 새롭게 선언 및 초기화한 값을 List<T> 인터페이스 형태로 반환한다
        List<T> newList = new ArrayList<>( l.size() );

        // list 내의 값을 T 형으로하는 반복문을 통해 newList 내에 function.apply() 메소드에 각각 다른 인자값을 준 값으로 초기화 한다
        for (T t : l) {
            // apply() 메소드는 어떻게 정의되어 있는거지? -> 저 integer -> integer / 10 *10 로 정의되어 있다
            newList.add( f.apply( t ) );
        }

        return newList;
    }

    static <T> void printEvenNum( Predicate<T> p, Consumer<T> c, List<T> l ) {
        System.out.print( "[" );
        for (T t : l) {
            // boolean 형 반환 -> 2로 나누었을 때, 나머지가 0이면 실행, 나머지가 0이 아니면 if 문을 실행하지 않는다
            if (p.test( t )) {
                c.accept( t );
            }
        }
        System.out.println( "]" );
    }

    static <T> void makeRandomList( Supplier<T> s, List<T> l ) {
        // 반복문 10번을 돌면서 실행
        for (int i = 0; i < 10; i++) {
            l.add( s.get() );
        }
    }
}
