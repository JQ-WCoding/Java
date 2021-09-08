package Chapter4.ch4.FlowEx;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("Count down");

        // 반복문 시작 -> 11 != 0 인지부터 확인해서 -> 0 != 0(false) 인 부분까지 출력하고 반복문이 종료된다
        // 11 != 0 임을 확인하고 i는 10으로 1 감소한 상태로 출력된다 -> for문에 제일 직관적인거 같다(개인적으로)
        while (i-- != 0) {
            System.out.println(i);
            // 임의로 천천히 출력 시키기 위한 반복문
            for (int j = 0; j < 2_000_000; j++) {
            }
        } // while

        System.out.println("End");
    } // main
}
