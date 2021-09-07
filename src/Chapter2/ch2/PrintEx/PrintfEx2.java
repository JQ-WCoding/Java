package Chapter2.ch2.PrintEx;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.naver.com";

        // 다양한 표현방법도 추가적으로 주석
        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);

        // 변수 d의 값을 float 형태로 표현
        System.out.printf("d = %f%n", d);
        System.out.printf("d = %14.10f%n", d); // 전체 자리 숫자는 14자리로 하면 소수점은 10자리까지 표현한다는 의미

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url);
    }
}
