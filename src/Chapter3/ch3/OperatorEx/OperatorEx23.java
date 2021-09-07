package Chapter3.ch3.OperatorEx;

public class OperatorEx23 {
    public static void main(String[] args) {
        String strA = "abc";
        String strB = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
        // strA와 strB의 차이점은 new String을 사용하여 객체선언을 직접 작성의 유무 차이다 -> 그것이 차이나는지 확인하기 위한 작업 (다름)
        System.out.printf("strA == \"abc\" ? %b%n", strA == "abc");
        System.out.printf("strB == \"abc\" ? %b%n", strB == "abc");
        // equals 메소드르 사용하여 값을 비교하기 -> 객체가 달라도 내용이 같으면 true를 반환
        System.out.printf("strA.equals(\"abc\") ? %b%n", strA.equals("abc"));
        System.out.printf("strB.equals(\"abc\") ? %b%n", strB.equals("abc"));
        System.out.printf("strB.equals(\"ABC\") ? %b%n", strB.equals("ABC"));
        // 대소문자를 구분하지 않고 같은지 비교하는 메소드
        System.out.printf("strB.equalsIgnoreCase(\"ABC\") ? %b%n", strB.equalsIgnoreCase("ABC"));
    }
}
