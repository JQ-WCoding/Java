package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        // 실험결과 -> num은 선언만 되어있고, sum은 초기화까지 완료 (num,sum이 모두 0으로 초기화 되지 않는다 헷갈리지 않게 조심)
        int num, sum = 0;
//        boolean flag = true;

        System.out.println("합계를 구할 수 입력 : (0을 입력하면 종료)");
        // flag를 사용하여 입력받은 숫자가 0일 경우 false로 전환되도록 한다 (내부 break를 통해 종료하는 것도 방법) -> 바꾼 방법
        while (true) {
            System.out.print(">>"); // 단순 표시

            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            num = Integer.parseInt(temp);

            if (num != 0) {
                sum += num;
                System.out.println("Sum : " + sum);
            } else { // num == 0이면 break를 이용하여 탈출
                break;
            }
        }

    }
}
