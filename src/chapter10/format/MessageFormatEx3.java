package chapter10.format;

import java.text.MessageFormat;

public class MessageFormatEx3 {
    public static void main(String[] args) throws Exception {
        String[] data = {
                "('Lee', '010-1111-1111', 22, '04-05');",
                "('Kim', '010-2222-2222', 24, '08-01');"
        };

//        String pattern = "INSERT INTO CUST_INFO VALUES ({0}, {1}, {2}, {3})";
        // 순번 변경 가능 {0}, {1} ... 의 순번은 변경 가능
        // 심지어 뒤에 ; 없어도 가능하다
        String pattern = "({0}, {2}, {1}, {3})";
        MessageFormat messageFormat = new MessageFormat(pattern);

        for (String str : data) {
            Object[] objects = messageFormat.parse(str);

            for (Object object : objects) {
                System.out.print(object + ",");
            }
            System.out.println();
        }
    }
}
