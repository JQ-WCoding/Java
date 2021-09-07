package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        // 선언 및 초기화
        int score = 0;
        char grade = ' ';

        // 입력 과정
        System.out.print("점수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        /*
         점수에 따른 char형 grade에 초기화 값이 달라진다
         else if를 사용하기에 이외의 조건에 대해서 좀 더 수월하게 진행 가능
         */
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 60) {
            grade = 'B';
        } else if (score >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.printf("Grade : %c%n", grade);
    }
}
