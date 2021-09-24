package chapter9.objects;

import java.math.BigInteger;

public class BigIntegerEx {
    // Thread.sleep() 사용시 예외처리 필요
    public static void main(String[] args) throws InterruptedException {
        // 1 ~ 10 까지 팩토리얼 계산하는 반복문
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d! = %s%n", i, calculateFactorial(i));
            // Thread.sleep 은 밀리 세컨즈로 인자값을 받기 때문에 300 은 300/1000 -> 0.3초 이다
            Thread.sleep(300);
        }
    }

    // factorial() 인자값을 추가해 불러오는 메소드
    static String calculateFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        // 값이 0 이면 1로 반환
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            // 아니라면 곱하기를 실행하는데 factorial 메소드를 다시 호출하면서 인자값에 -1 을 한 값을 계속 넘긴다 0이 될때까지
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
