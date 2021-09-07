package Chapter3.ch3.OperatorEx;

public class OperatorEx29 {
    public static void main(String[] args) {
        /*
        ~ 은 비트전환 연산자로 !와 비슷하다
         */
        byte a = 10;
        byte b = -10;

        System.out.printf("a = %d \t %s%n", a, toBinaryString(a));
        // -> - 부호를 선택할 땐, ~도 있지만 단순 -를 이용하는 것도 방법이다
        System.out.printf("~a = %d \t %s%n", ~a, toBinaryString(~a));
        // 정수의 음수 부호를 찾으려 한다면 ~(x) + 1을 하고, 음수에서 양수로 전환한다면 ~(a-1)을 사용하면 된다 -> but, - 부호가 짱임
        System.out.printf("~a + 1 = %d \t %s%n", ~a + 1, toBinaryString(~a + 1));
        System.out.printf("~~a = %d \t %s%n", ~~a, toBinaryString(~~a));
        System.out.println();
        // b는 음수에서 양수로 전환하는 것을 표현
        System.out.printf("b = %d%n", b);
        System.out.printf("~(b -1) = %d%n", ~(b - 1));
    }

    private static Object toBinaryString(int a) {
        // zero 변수를 사용하여 2진법을 표현하기 위한 바탕을 만든다
        String zero = "00000000000000000000000000000000000000000000000000000000000";
        // temp 변수를 통해 0000000... + a의 값을 추가 한다
        String temp = zero + Integer.toBinaryString(a);
        // 0 ~ (temp의 길이 - 32) 만큼을 잘라 보낸다
        return temp.substring(temp.length() - 32);
    }
}
