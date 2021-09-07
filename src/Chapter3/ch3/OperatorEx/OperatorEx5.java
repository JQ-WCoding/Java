package Chapter3.ch3.OperatorEx;

public class OperatorEx5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        // 나머지의 소수점을 확인하기 위해 float형으로 형변환 하여 나누기 진행
        System.out.printf("%d / %f = %f%n", a, (float) b, a / (float) b);

    }
}
