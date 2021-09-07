package Chapter2.ch2.ScannerEx;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        // Scanner 사용을 위한 선언 과정
        Scanner scanner = new Scanner(System.in);
        // 정수를 입력 받기 위한 알림창 같은 느낌
        System.out.println("두자리 정수를 입력하세요 : ");
        // inputNumber 에 입력한 숫자가 초기화
        String inputNumber = scanner.nextLine();
        // int형 변수 num에 입력받은 String형 inputNumber값을 정수형으로 변환
        int num = Integer.parseInt(inputNumber);

        // 출력문
        System.out.println("입력내용(inputNumber) : " + inputNumber);
        System.out.printf("지시어로 받은 내용(num) : %d%n", num);
    }
}
