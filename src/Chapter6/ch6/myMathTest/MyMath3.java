package Chapter6.ch6.myMathTest;

public class MyMath3 {
    /*
 인스턴스 변수가 없음으로 static을 활용해 사용의 편의성을 증가 시킨다
 해당 매개변수만으로 수식이 해결 가능하도록 설계되어 있다
 인스턴스화 필요없이 바로 메소드 사용가능 -> 인자값을 맞춰 전달하면 계산이 가능
 */
    static long add(long a, long b) {
        return a + b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }
}
