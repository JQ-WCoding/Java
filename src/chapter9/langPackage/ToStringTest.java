package chapter9.langPackage;

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {
        // new String() 쓰지 말라 하셨음 굳이 new String 이 필요없는 예제는 습관들이기
        String str = "Seoul";
        Date today = new Date();

        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());

        // str 과 today 의 toString()은 해시코드를 반환하지 않고 값을 반환 -> String 클래스와 Date 클래스에 toString()은 해당 값을 반환하도록 오버라이딩 되어있음
    }
}
