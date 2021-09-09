package Chapter6.ch6.recursiveCall;

public class FactorialTest {
    public static void main(String[] args) {
        // 재귀함수 -> 다시 나를 부르는 함수라는 뜻
        int result = factorial(5); // 120 예상값

        // 결과값 출력
        System.out.println(result);
    }

    /**
     * 팩토리얼 생성
     * @param n
     * @return result
     */
    static int factorial(int n) {
        // 결과 값은 정수형이며 0으로 초기화한다.
        int result = 0;

        // 만약 n이 1인 경우 1!은 곱할 것이 없기 때문에 1이다.
        if (n == 1) {
            result = 1;
        }
        /*
         1이 아닌 경우, 매개변수 * 재귀함수(인자) 이다. -> 위와 같이 5라면, 5 * (factorial(4))와 같은 의미로 저 안에는
         5*(4*(3*factorial(2)))...와 같이 진행된다. -> 스택이 계속 쌓인다
         인자값 5를 가진 factorial() 함수 안에 인자값 4를 가진 factorial()과 같은 식으로 계속 진행
         */
        else {
            result = n * factorial(n - 1);
        }

        // result를 반환
        return result;
    }
}
