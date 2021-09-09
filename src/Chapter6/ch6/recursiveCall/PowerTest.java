package Chapter6.ch6.recursiveCall;

public class PowerTest {
    public static void main(String[] args) {
        int x = 3, y = 4;
        long result = 0L;

        /*
         반복문 실행 -> 결과값에 power 재귀함수 (3, 1), (3, 2) (3, 3) (3, 4)의 인자값이 순서대로 보내진다
         result는 해당 power() 메소드의 반환값을 추가적으로 계속 더하는 방식이다
         */
        for (int i = 1; i <= y; i++) {
            result += power(x, i);
        }

        System.out.println(result); // 120!? -> 5! 같은 값
    }

    /**
     * 해당 수의 승 만큼 더하기(?)
     *
     * @param a
     * @param n
     * @return a * power(a, n-1)
     */
    static long power(int a, int n) {
        // n이 1이라면 매개변수 a의 1승과 같기 때문에 해당 값 a를 그대로 반환 -> resturn문 확인시 이후 하단 부분은 확인하지 않고 종료
        if (n == 1) {
            return a;
        }
        // 위의 조건문의 경우가 아니라면 a * power(a, n-1)을 반환하여 재귀호출이 n이 1이되는 값까지 진행된다
        return a * power(a, n - 1);
    }
}
