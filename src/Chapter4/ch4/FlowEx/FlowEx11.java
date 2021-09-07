package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        // 입력
        System.out.println("Input security number : ");
        Scanner scanner = new Scanner(System.in);
        String registerNo = scanner.nextLine();
        // 성별
        char gender = registerNo.charAt(7);

        switch (gender) {
            case '1':
            case '3':
                switch (gender) {
                    case '1':
                        System.out.println("Born in 1990s, Man");
                        break;
                    case '3':
                        System.out.println("Born in 2000s, Man");
                        break;
                }
                break;
            case '2':
            case '4':
                switch (gender) {
                    case '2':
                        System.out.println("Born in 1990s, Woman");
                        break;
                    case '4':
                        System.out.println("Born in 2000s, Woman");
                        break;
                }
                break;
            default:
                System.out.println("No identified number");
        }
    }
}
