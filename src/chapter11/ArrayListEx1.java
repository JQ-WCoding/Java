package chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // ArrayList 객체는 배열을 생성 -> 10크기 짜리 list 생성
        ArrayList list1 = new ArrayList( 10 );

        // list1에 값을 추가한다 -> 순서대로 입력 modCount++ 를 통해 해당 메소드가 실행되어 값이 입력될때 마다 1씩 증가하는 변수 존재
        // 총 6개 -> 4개 더 가능
        list1.add( new Integer( 5 ) );
        list1.add( new Integer( 3 ) );
        list1.add( new Integer( 4 ) );
        list1.add( new Integer( 1 ) );
        list1.add( new Integer( 2 ) );
        list1.add( new Integer( 0 ) );

        // list2는 list1의 1번 0 다음 1 인덱스부터 ~ 3까지 입력되는 값이 생성
        // 1, 2, 3
        ArrayList list2 = new ArrayList( list1.subList( 1, 4 ) );
        print( list1, list2 );

        // Collections 정렬 -> Collections 객체의 sort() 를 사용해 list.sort() 실행
        Collections.sort( list1 );
        Collections.sort( list2 );
        print( list1, list2 );

        // list1은 list2의 값을 모두 가지고 있는지 확인하는 메소드 -> 반환 타입 : boolean
        System.out.println( "list1.containsAll(list2) : " + list1.containsAll( list2 ) );

        // list2 에 값 입력
        list2.add( "B" );
        list2.add( "C" );

        // 특정 인덱스에 값 입력
        list2.add( 3, "A" );
        print( list1, list2 );

        list2.set( 3, "AA" );
        print( list1, list2 );

        System.out.println( "list1.retainAll(list2) : " + list1.retainAll( list2 ) );

        print( list1, list2 );

        for ( int i = list2.size() - 1; i >= 0; i-- ) {
            // list1에서 list2의 값을 가지고 있으면 list2의 해당 인덱스 값을 제거
            // 1, 3, 4 제거
            if ( list1.contains( list2.get( i ) ) ) {
                list2.remove( i );
            }
        }

        print( list1, list2 );
    }

    // 출력 메소드
    static void print(ArrayList list1, ArrayList list2) {
        System.out.println( "list1 : " + list1 );
        System.out.println( "list2 : " + list2 );
        System.out.println();
    }
}
