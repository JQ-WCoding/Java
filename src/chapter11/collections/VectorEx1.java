package chapter11.collections;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector vector = new Vector( 5 ); // 크기 5인 vector
        vector.add( "1" );
        vector.add( "2" );
        vector.add( "3" );
        print( vector );

        vector.trimToSize(); // 지정한 capacity 보다 값이 적은 경우 크기 줄임 메소드
        System.out.println( "After trimToSize()" );
        print( vector );

        vector.ensureCapacity( 6 ); // 용량 크기
        System.out.println( "After ensureCapacity( 6 )" );
        print( vector );

        vector.setSize( 10 ); // 값 크기 증가 -> 왜 capacity 도 12로 증가했을까?
        // 기본 Vector 10 증가 -> size 10 증가는 맞음 근데 왜 capacity 는 2? 심지어 전에는 3 크기 차였는데
        // capacity 가 부족할 경우 해당 값의 2배 크기로 증가된 값으로 초기화된다
        System.out.println( "After setSize( 10 )" );
        print( vector );

        // capacity 는 남아있지만 값 전부 삭제
        vector.clear();
        System.out.println( "After clear()" );
        print( vector );
    }

    static void print(Vector vector) {
        // Vector 값 / 값 크기 / 전체 크기 용량? 표현
        System.out.println( vector );
        System.out.println( "size : " + vector.size() );
        System.out.println( "capacity : " + vector.capacity() );
        // 띄어쓰기
        System.out.println();
    }
}
