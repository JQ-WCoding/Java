package chapter11.collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put( "LLL", "1111" );
        // 중복인 경우를 확인하기 위해
        hashMap.put( "SSS", "1234" );
        hashMap.put( "SSS", "3456" );
        // 해당 HashMap 은 key 값으로 아이디 value 값으로 비밀번호를 설정했다

        Scanner scanner = new Scanner( System.in );

        String id;
        String pw;

        while ( true ) {
            System.out.println( "ID & PW : " );
            System.out.print( "ID : " );
            // 입력과 동시에 공백 제거
            id = scanner.nextLine().trim();

            System.out.print( "PW : " );
            // 동일하게 비밀번호 입력 받은 후 공백 제거
            pw = scanner.nextLine().trim();
            System.out.println();

            // hashMap 변수에 id 라는 key 값이 없는 경우
            if ( !hashMap.containsKey( id ) ) {
                // 아이디가 없습니다
                System.out.println( "No id" );
            } else {
                if ( (hashMap.get( id )).equals( pw ) ) {
                    // hashMap 의 id 값과 pw 값이 같은 경우
                    System.out.println( "id pw same!" );
                    break;
                } else {
                    System.out.println( "not correct pw" );
                }
            }
        }
    }
}
