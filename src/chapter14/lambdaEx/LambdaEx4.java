package chapter14.lambdaEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx4 {
    public static void main( String[] args ) {
        // ArrayList Integer 형으로 list 선언
        ArrayList<Integer> list = new ArrayList<>();

        // 해당 배열에 0 ~ 9 까지 값 초기화
        for (int i = 0; i < 10; i++) {
            list.add( i );
        }

        // list 내부에 이미 0 ~ 9 까지의 값이 존재한다
        // forEach 메소드는 ArrayList 내에 선언되어 있다. 내부적으로 반복문을 index 0 부터 max 까지 진행한다
        // forEach 메소드에 바로 사용
        list.forEach( integer -> System.out.print( integer + "," ) );
        System.out.println();

        // removeIf() 해당 값에 대해 제거하는 방법
        list.removeIf( x -> x % 2 == 0 || x % 3 == 0 );
        // 2로 나누어지거나 3으로 나누어지는 수의 경우 제거한다
        System.out.println( list );

        // 전부 10 곱하기 값으로 교체한다
        list.replaceAll( integer -> integer * 10 );
        System.out.println( list );


        // Map 인터페이스 참조타입의 HashMap 오브젝트형으로 인스턴스화
        Map<String, String> map = new HashMap<>();
        // <String, String> 형이기 때문에 put() 에서 "1", "1"로 인자값이 들어간다
        map.put( "1", "1" );
        map.put( "2", "2" );
        map.put( "3", "3" );
        map.put( "4", "4" );

        // forEach() 메소드 정의 -> 인자값을 통해 k 와 v 를 출력한다
        // default 메소드로 이미 정의되어 있지만 -> 새롭게 정의 해당 인자값으로 k, v를 필요로 한다
        // key , value 를 각각 정의해둘 수 있음
        map.forEach( ( k, v ) -> System.out.print( "{" + k + "," + v + "}," ) );
        System.out.println();

        // Runnable 함수형 인터페이스에는 run() 메소드가 정의되어 있다 -> 기본적으로 많이 사용하는 함수형 인터페이스에 대해서는 이미 정의되어 있음으로
        // 재정의하지 말고 찾아보고 사용하도록 하자!
//        Runnable runnable = ( ) -> System.out.println( "hi" );
    }
}
