package Chapter6.ch6.MyMathTest;

public class MyMath {
    // 사칙연산 메소드

    /**
     * 더하기
     *
     * @param a
     * @param b
     * @return a+b
     */
    public long add(long a, long b) {
        // 매개변수 a, b의 합을 반환 타입 long에 맞게 반환
        return a + b;
    }

    /**
     * 빼기
     *
     * @param a
     * @param b
     * @return a-b
     */
    public long subtract(long a, long b) {
        return a - b;
    }

    /**
     * 곱하기
     *
     * @param a
     * @param b
     * @return a*b
     */
    public long multiply(long a, long b) {
        return a * b;
    }

    /**
     * 나누기
     *
     * @param a
     * @param b
     * @return a/b
     */
    public double divide(double a, double b) {
        // 소수점을 고려해 double로 생성됨
        return a / b;
    }
}
