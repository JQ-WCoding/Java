package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        // 성적 관련 A0 A+ A- 와 같이 표현하기 위해
        char grade = ' ', option = '0';

        //입력 과정
        System.out.print("Input : ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("Your score : %d%n", score);
        // A 학점 관련 + - 설정
        if (score >= 80) {
            grade = 'A';
            if (score >= 90) {
                option = '+';
            } else if (score < 85) {
                option = '-';
            }
            // B학점 관련 + - 설정
        } else if (score >= 60) {
            grade = 'B';
            if (score >= 70) {
                option = '+';
            } else if (score < 65) {
                option = '-';
            }
            // B- 이하의 학점은 모두 C학점이다
        } else {
            grade = 'C';
        }

        System.out.printf("Your Grade : %c%c", grade, option);
    }
}
