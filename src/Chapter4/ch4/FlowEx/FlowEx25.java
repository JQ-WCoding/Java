package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        // 입력 과정
        System.out.println("Input Number : ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        num = Integer.parseInt(temp);

        while (num != 0) { // -> 입력받은 숫자를 10으로 계속 나누면서 1 ~ 작성한 수의 자리까지 각 자리수의 수를 더하는 방법
            // sum 에 (num % 10)의 값을 계속 더한다
            sum += num % 10;
            System.out.printf("sum = %3d num = %d%n", sum, num);
            // num 은 num / 10의 몫으로 초기화
            num /= 10;
        }

        System.out.printf("각 자리수 합 : %d", sum);
    }
}
