package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        // 입력
        System.out.println("Input your security number : ");
        Scanner scanner = new Scanner(System.in);
        String registerNo = scanner.nextLine();

        // 성별을 구하기 위해 주민등록번호 8번째 자리의 수로 확인한다
        char gender = registerNo.charAt(7);

        // 성별 구분 숫자
        switch (gender){
            case '1': case '3':
                System.out.println("Man");
                break;
            case '2': case '4':
                System.out.println("Woman");
                break;
            default:
                System.out.println("No identified number");
        }
    }
}
