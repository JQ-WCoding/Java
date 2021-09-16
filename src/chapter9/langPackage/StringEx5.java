package chapter9.langPackage;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

public class StringEx5 {
    public static void main(String[] args) throws Exception {
        String str = "가";

        /*
         getBytes() 가 UnsupportedEncodingException 예외를 throws 하고 있기 때문에 main()문에 부모 클래스인 Exception throws
         StringCoding.encode() 메소드를 반환 -> 인자값으로 받은 형식으로 encoding 한 문자열을 반환한다
         */
        byte[] bArr1 = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949"); // MS949 와 동일

        // joinArr()
        System.out.println("UTF-8 : " + joinArr(bArr1));
        System.out.println("CP949 : " + joinArr(bArr2));
    }

    static String joinArr(byte[] arr) {
        // StringJoiner 클래스 사용
        StringJoiner stringJoiner = new StringJoiner(":", "[", "]");

        // 반복문을 통해 참조변수 stringJoiner 에
        for (byte x : arr) {
            // Formatter 클래스를 사용하는 format() 을 통해 2자리 수를 16진수 법으로 변경한 매개변수 arr 을 stringJoiner 에 초기화
            stringJoiner.add(String.format("%02X", x));
            // printf() 와 사용법 동일
        }
        // 반환형이 String 이기 떄문에 toString()을 통해 맞춰줌
        return stringJoiner.toString();
    }
}
