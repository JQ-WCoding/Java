package chapter10.format;

import java.text.MessageFormat;

public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUSTOMER";
        // '' '' 형식으로 사용한 이유는 MessageFormat 에서 ' 하나는 escape 문자로 처리하기 때문에 '' 를 사용한다
        String message = "INSERT INTO " + tableName + " VALUES(''{0}'', ''{1}'', {2}, ''{3}'');";

        Object[][] arguments = {
                {"JunQ", "010-0000-0000", "23", "09-14"},
                {"Kim", "010-1111-1111", "32", "10-23"},
        };

        // 2차원 반복문의 경우 for 문에서 첫번째 [] 배열임은 선언해주어야 한다 -> 기억해두기
        // Query Insert 구문 반복문으로 생성해보기
        for (Object[] ar : arguments) {
            String result = MessageFormat.format(message, ar);
            System.out.println(result);
        }
    }
}
