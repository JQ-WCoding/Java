package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("Input month : ");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            default: // -> case 12, 1, 2 에 관련된 값은 기본값으로 둠, default는 break가 필요없다. 즉, 대신 12 보다 큰 숫자인 13 ~ 작성하여도 Winter의 값이 출력된다.
                System.out.println("Winter");
        }
    }
}
