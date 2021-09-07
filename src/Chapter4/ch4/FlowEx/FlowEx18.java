package Chapter4.ch4.FlowEx;

public class FlowEx18 {
    public static void main(String[] args) {
        // 구구단 표현 방법
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
            System.out.println(); // 줄바꿈용
        }
    }
}
