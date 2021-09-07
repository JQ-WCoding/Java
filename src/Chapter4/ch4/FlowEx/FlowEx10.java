package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        // 입력
        System.out.println("Input score : ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine(); // -> nextLine() 메소드는 String으로 반환
        score = Integer.parseInt(temp);

        switch (score / 10) {
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        // 초기화된 학점 출력
        System.out.printf("Your grade : %c%n", grade);
    }
}
