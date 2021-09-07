package Chapter3.ch3.OperatorEx;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // char형 ch 선언 및 초기화
        char ch = ' ';
        System.out.printf("문자를 입력하세요:");

        // input 변수에 scanner를 이용하여 값 초기화
        String input = scanner.nextLine();
        // 입력받은 input 값의 가장 앞자리 문자를 ch로 초기화
        ch = input.charAt(0);

        // 해당 값이 숫자이면
        if ('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자 -> 숫자 %n");
        }

        // 해당 값이 문자이면
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자 -> 영문자 %n");
        }
    }
}
