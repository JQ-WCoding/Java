package Chapter4.ch4.FlowEx;

public class FlowEx20 {
    public static void main(String[] args) {
        // 짝 맞추기 5개 마다 줄바꿈
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[%d, %d]", i, j);
            }
            System.out.println();
        }
    }
}
