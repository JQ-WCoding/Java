package Chapter4.ch4.FlowEx;

public class FlowEx29 {
    public static void main(String[] args) {
        // 반복문 100번 실행
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i = %d ", i);

            int temp = i;
            // for문 안에 다시 do while문을 통해 temp가 1의 자리수가 될때까지 진행
            do {
                // temp가 10으로 나눈 나머지에 다시 3으로 나눈 나머지가 0이며 temp를 10으로 나눈 나머지가 0이 아니면 조건문 실행
                if (temp % 10 % 3 == 0 && temp % 10 != 0) System.out.print("Clap!");
            } while ((temp /= 10) != 0); // temp 나누기 10의 몫이 0이 아닌경우 계속 실행

            System.out.println();
        }
    }
}
