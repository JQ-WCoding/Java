package chapter15.input_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {
    public static void main( String[] args ) {
        try {
            // 파일명 선언 및 초기화
            String fileName = "UserInfo.ser";
            // 파일 Stream 출력 클래스 사용
            FileOutputStream fos = new FileOutputStream( fileName );
            BufferedOutputStream bos = new BufferedOutputStream( fos );
            ObjectOutputStream oos = new ObjectOutputStream( bos );

            // UserInfo 선언 및 초기화시 변수 값 초기화
            UserInfo user1 = new UserInfo( "Java", "1234", 20 );
            UserInfo user2 = new UserInfo( "Python", "1111", 25 );

            // ArrayList UserInfo 타입으로만 받는 배열 생성
            ArrayList<UserInfo> list = new ArrayList<>();
            list.add( user1 );
            list.add( user2 );

            // arraylist 로 받아진 값을 직렬화하기 위해 -> ObjectOutputStream 값에 초기화
            oos.writeObject( user1 );
            oos.writeObject( user2 );
            // ArrayList
            oos.writeObject( list );
            oos.close();
            System.out.println( "직렬화가 끝남" );
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
