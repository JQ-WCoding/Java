package Chapter3.ch3.OperatorEx;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 2_000_000 * 2_000_000; // -> overflow 발생할 것
        long b = 3_000_000 * 3_000_000L; // -> (long)형 값을 추가하여 정상적으로 원하는 값을 출력할 수 있다

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
