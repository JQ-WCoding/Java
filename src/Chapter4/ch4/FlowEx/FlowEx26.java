package Chapter4.ch4.FlowEx;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0, num = 0;

        while ((sum += ++num) <= 100) {
            // 선증감 후 확인임으로 num은 0으로 초기화 되어 선언되었지만 1부터 시작
            System.out.printf("%d - %d%n", num, sum);
        }

    }
}
