package Chapter4.ch4.FlowEx;

public class FlowEx13 {
    public static void main(String[] args) {
        // 총합을 위한 변수
        int sum = 0;
        // 1~10까지 반복
        for (int i = 1; i <= 10; i++) {
            sum += i; // sum 의 값에 i를 계속해서 더한다
            System.out.printf("ADD 1 ~ %2d : %2d%n", i, sum);
        }
    }
}
