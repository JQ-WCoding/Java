package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx9 {
    public static void main(String[] args) {
        char grade = ' ';

        // 성적 입력
        System.out.println("Input score : ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        // if 문을 switch로 변경했을 경우 -> 생략해서 표현함
        switch (score) {
            case 100:
            case 99:
            case 98:
                grade = 'A';
                break;
            case 89:
            case 88:
            case 87:
                grade = 'B';
                break;
            case 79:
            case 78:
            case 77:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.printf("Your grade : %c%n", grade);
    }
}
