package Chapter2.ch2.FloatEx;

public class FloatEx1 {
    public static void main(String[] args) {
        // f1과 d1은 값은 같지만 마지막 형태가 d, f
        float f1 = 9.123333334444567789f;
        float f2 = 1.23455553355632455f;
        double d1 = 9.123333334444567789d;
        double d2 = 9.123333334444567789d;
        double d3 = 9.123333334444567789d;
        /*
        float은 연산속도 빠름, 메모리 절약
        double은 큰 범위의 값과 높은 정밀도
         */

        // 띄어쓰긴 왜 한걸까..?
        System.out.printf("      123456789012345678901234%n");
        // %f는 기본적으로 소수점 이하 6자리까지만 출력 -> 7자리에서 반올림되어 출력
        System.out.printf("f1 : %f%n", f1); // 소수점 이하 6째자리까지 출력
        // %(a).(b)f a숫자 자리 중 b만큼의 자리는 소수점 이하의 수로 출력하겠다는 의미
        System.out.printf("f1 : %24.20f%n", f1);
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.printf("d1 : %24.20f%n", d1);
        System.out.printf("d2 : %24.20f%n", d2);
        System.out.printf("d3 : %24.20f%n", d3);
    }
}
