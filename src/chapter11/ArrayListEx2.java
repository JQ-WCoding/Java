package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        // 상수 LIMIT 선언
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        // 불확실한 상황을 대비해 여유로운 공간 확보 -> 자동으로 값이 추가적으로 들어올 때마다 크기가 변경되지만, 처리시간이 많이 소요되어 비추천!
        List list = new ArrayList( length / LIMIT + 10 );

        // 조건에 맞는 값 만큼 문자열을 잘라 list 에 더한다
        for ( int i = 0; i < length; i += LIMIT ) {
            if ( i + LIMIT < length ) {
                list.add( source.substring( i, i + LIMIT ) );
            } else { // i 부터 끝까지
                list.add( source.substring( i ) );
            }
        }

        for ( Object list2 : list ) {
            System.out.println( list2 );
        }
    }
}
