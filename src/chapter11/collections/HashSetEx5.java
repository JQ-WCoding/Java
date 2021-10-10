package chapter11.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        HashSet set2 = new HashSet();
        HashSet setSame = new HashSet();
        HashSet setAll = new HashSet();
        HashSet setDiff = new HashSet();

        // set 은 값이 중복되지 않는다
        set1.add( "1" );
        set1.add( "2" );
        set1.add( "3" );
        set1.add( "4" );
        set1.add( "5" );
        System.out.println( "A : " + set1 );

        set2.add( "3" );
        set2.add( "4" );
        set2.add( "5" );
        set2.add( "6" );
        System.out.println( "B : " + set2 );

        // set1 과 set2 의 교집합을 구하기 위한 일
        // Iterator 는 읽어들이기 용도
        Iterator iterator = set2.iterator();
        // Object 외부 선언
        Object temp;
        while ( iterator.hasNext() ) {
            // Iterator 에 다음 값이 존재하면 temp 에 초기화
            temp = iterator.next();
            // set1 이 temp 에 포함되어 있는 경우
            if ( set1.contains( temp ) ) {
                // HashSet 의 인스턴스화된 setSame 에 초기화
                setSame.add( temp );
            }
        }

        iterator = set1.iterator();
        while ( iterator.hasNext() ) {
            temp = iterator.next();
            // 포함되어 있지 않은 경우
            if ( !set2.contains( temp ) ) {
                setDiff.add( temp );
            }
        }

        // Set 이기에 같은 값을 add() 하면 동일한 값은 하나로 저장되어 All 에서 결과값이 하나씩만 나오는 것
        iterator = set1.iterator();
        while ( iterator.hasNext() ) {
            setAll.add( iterator.next() );
        }

        iterator = set2.iterator();
        while ( iterator.hasNext() ) {
            setAll.add( iterator.next() );
        }

        System.out.println( "Same : " + setSame );
        System.out.println( "All : " + setAll );
        System.out.println( "Diff : " + setDiff );
    }
}
