package chapter9.objects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args) {
        // 서로 다른 주소를 참조하기 위해 -> new String[][] 으로 각각 선언
        String[][] strArr1 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] strArr2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        // strArr1 출력문
        System.out.println("strArr1 = {");
        for (String[] str : strArr1) {
            System.out.print(Arrays.toString(str));
        }
        System.out.println("}");

        // strArr2 출력문
        System.out.println("strArr2 = {");
        for (String[] str : strArr2) {
            System.out.print(Arrays.toString(str));
        }
        System.out.println("}");

        // strArr1, strArr2 를 비교하는 방법
        System.out.println("equals(strArr1, strArr2) = " + Objects.equals(strArr1, strArr2)); // 2차원 배열에 간단히 equals() 로는 비교가 불가능하다
        System.out.println("deepEquals(strArr1, strArr2) = " + Objects.deepEquals(strArr1, strArr2)); // Objects 클래스의 deepEquals()를 이용해 비교한다

        // Objects 클래스를 사용하여 isNull(), hashCode(), nonNull() 등의 메소드를 작성한다
        System.out.println("isNull(null) : " + Objects.isNull(null)); // 인자로 받은 객체가 null 인지 아닌지 판단하는 메소드 -> isNull() : 해당 객체는 null 인가?
        System.out.println("nonNull(null) : " + Objects.nonNull(null)); // -> nonNull() : 해당 객체는 null 이 아닌가?

        System.out.println("hashCode(null) : " + Objects.hashCode(null)); // null 이 아니라면 해당 주소에대한 결과물을 반환 / null 인 경우에는 0으로 반환
        System.out.println("toString(null) : " + Objects.toString(null));
        System.out.println("toString(null, \"\") : " + Objects.toString(null, "")); // 두번째 인자값을 지정하여 null 인 경우 반환받을 값을 지정할 수 있다

        Comparator comparator = String.CASE_INSENSITIVE_ORDER; // comparator 비교 관련 인터페이스 -> 하단과 같이 String 에 대해서 대문자로 맞추거나 소문자로 통일하는 조건문을 거쳐 대소문 관련없이 비교할 수 있도록 한다
        /*
        char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if (c1 != c2) {
                    c1 = Character.toUpperCase(c1);
                    c2 = Character.toUpperCase(c2);
                    if (c1 != c2) {
                        c1 = Character.toLowerCase(c1);
                        c2 = Character.toLowerCase(c2);
         */
    }
}
