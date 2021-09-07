package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.println("(1)가위 (2)바위 (3)보 중 하나 입력 : ");
        // 입력
        Scanner scanner = new Scanner(System.in);
        int myChoice = scanner.nextInt();
        // 컴퓨터의 값을 랜덤으로 1, 2, 3중에 출력되도록 한다
        int comChoice = (int) (Math.random() * 3) + 1; // 0~2이기 때문에 +1을 통해 1~3으로 변경해준다
        // 각자의 값을 출력
        System.out.println("You : " + myChoice);
        System.out.println("Com : " + comChoice);

        // if문과 동일하게 나의 선택과정에 따른 결과를 정수로 구한다
        switch (myChoice - comChoice) {
            case 2:
            case -1:
                System.out.println("Loose");
                break;
            case 1:
            case -2:
                System.out.println("Win");
                break;
            case 0:
                System.out.println("Draw");
                break;
        }

    }
}
