package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        // 상수 LIMIT 선언
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

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
