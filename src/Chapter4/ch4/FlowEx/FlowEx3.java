package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        System.out.println("Input : ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        /*
         하나의 조건문만 계산하기에 더 효율적
         if문 -> false인 경우 -> else문
         */
        if (num == 0){
            System.out.println("Num = 0");
        }else {
            System.out.println("Num != 0");
        }
    }
}
