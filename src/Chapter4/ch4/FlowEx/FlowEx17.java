package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("How many lines? : ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        num = Integer.parseInt(temp);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
