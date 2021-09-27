package chapter10.format;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        // {0} {1} {2} 와 같은 형식을 사용하여 MessageFormat 에 맞게 적용 -> MessageFormat.format() 의 arguments 는 여러개여도 가능하며, Object 형 이다.
        String message = "Name: {0} \nTel: {1} \nAge: {2} \nBirthDay: {3}";

        Object[] arguments = {
                "JunQ", "010-0000-0000", "54", "06-12"
        };

        // StringBuffer 로 반환받아 String 형으로 형변환
        String result = MessageFormat.format(message, arguments);

        System.out.println(result);
    }
}
