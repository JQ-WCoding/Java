package Chapter3.ch3.OperatorEx;

public class OperatorEx10 {
    public static void main(String[] args) {
        int i = 1000000;

        // 1000000 * 1000000 의 경우 -> int 값의 범위를 넘어가기 때문에 overflow 발생
        int answer1 = i * i / i;
        // 나누기를 먼저할 경우 1 * 1000000 이 됨으로 문제 없이 연산 가능
        int answer2 = i / i * i;

        System.out.printf("%d * %d / %d = %d%n", i, i, i, answer1);
        System.out.printf("%d / %d * %d = %d%n", i, i, i, answer2);
    }
}
