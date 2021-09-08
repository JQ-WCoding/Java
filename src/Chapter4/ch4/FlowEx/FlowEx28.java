package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int num = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1; // 1 ~ 100
        Scanner scanner = new Scanner(System.in);

        do { // do를 통해 반복문이 전혀 실행되지 않을 경우를 방지해 무조건 한번 이상 실행될 수 있도록 한다.
            System.out.println("1 ~ 100 : ");
            num = scanner.nextInt();

            // 정답보다 입력 값이 클 경우
            if (num > answer) System.out.println("Down");
            // 정답보다 입력 값이 작을 경우
            else if (num < answer) System.out.println("Up");
        } while (num != answer);

        System.out.println("Correct!");
    }
}
