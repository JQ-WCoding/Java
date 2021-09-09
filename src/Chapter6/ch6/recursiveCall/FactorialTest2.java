package Chapter6.ch6.recursiveCall;

public class FactorialTest2 {
    public static void main(String[] args) {
        int n = 14;
        long result = 0L; // Long 표시

        // n을 14로 초기화 횟수만큼 반복문 진행 -> 0부터가 아닌것을 유의
        for (int i = 1; i <= n; i++) {
            // 결과값 초기화
            result = factorial(i);

            // 만약 n이 0이하 20초과의 수라면 -1이 반환 될것이고 해당 조건문이 실행된다
            if (result == -1) {
                // 0보다 크고 20이하인 수를 요구하는 안내문
                System.out.printf("Cannot solve : (0 < n <= 20) : %d%n", n);
                // 해당 조건이 실행되면 유형하지 않은 숫자이기에 break;통해 반복문을 더이상 돌지 않고 탈출시킨다.
                break;
            }
            // 반복문이 진행되는 동안 i의 값변화에 따라 계속해서 출력해주는 문구 -> 시각적 이유를 위해, %20d를 사용(공백 넓힘)
            System.out.printf("%2d! = %20d%n", i, result);
        }
    }

    /**
     * 팩토리얼
     *
     * @param n
     * @return n * factorial(n-1)
     */
    static long factorial(int n) {
        // 유형성을 위해 0이하 20초과의 수는 제외한다 -> 스택오버플로우 발생 방지
        if (n <= 0 || n > 20) {
            return -1;
        }
        // 만약 n이 1이하이면 -> 1로 반환, 정수형 매개변수 n이기 때문에 소숫점이지 않고 1임으로 1!은 1이다.
        if (n <= 1) {
            return 1;
        }
        // 재귀함수 반환
        return n * factorial(n - 1);
    }
}
