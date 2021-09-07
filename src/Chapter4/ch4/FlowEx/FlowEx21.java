package Chapter4.ch4.FlowEx;

public class FlowEx21 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // i와 j가 같은 경우에만 출력
                if (i == j) {
                    System.out.printf("[%d,%d]", i, j);
                    // 나머지는 [%d,%d]의 크기가 5공백과 같음으로 %5c 공백을 대입해 정렬
                } else {
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }
    }
}
