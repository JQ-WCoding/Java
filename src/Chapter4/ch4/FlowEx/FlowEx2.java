package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int num;

        System.out.println("Input : ");

        Scanner scanner = new Scanner(System.in);
        // 다음줄을 scanner로 읽어들인다
        String temp = scanner.nextLine();
        // 이후 다시 Integer.parseInt() 메소드를 이용하여 int형으로 형변환
        num = Integer.parseInt(temp);

        // if는 조건문이 2개이기에 식 모두 확인해야한다
        if (num == 0) {
            System.out.println("Number = 0");
        }
        if (num != 0) {
            System.out.println("Number != 0");
            System.out.printf("Number = %d", num);
        }
    }
}
