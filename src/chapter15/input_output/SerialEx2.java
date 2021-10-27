package chapter15.input_output;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerialEx2 {
    public static void main( String[] args ) {
        try {
            String fileName = "UserInfo.ser";
            // 파일의 값들을 읽어들이기 위한 클래스 선언 -> 직렬화된 데이터 가져오기
            FileInputStream fis = new FileInputStream( fileName );
            BufferedInputStream bis = new BufferedInputStream( fis );
            ObjectInputStream ois = new ObjectInputStream( bis );

            // 해당 객체를 읽어들여 값을 저장하는 readObject() 메소드 사용
            UserInfo2 user1 = (UserInfo2) ois.readObject();
            UserInfo2 user2 = (UserInfo2) ois.readObject();
            ArrayList<UserInfo2> list = (ArrayList<UserInfo2>) ois.readObject();

            // user1과 2의 값이 무엇인지 ArrayList 배열로 합친 값은 무엇인지 읽어들여 출력
            System.out.println( user1 );
            System.out.println( user2 );
            System.out.println( list );

            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
