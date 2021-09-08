package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("(1)apple \n(2)banana \n(3)orange \nchoose(1~3) / (to End press 0) ");

            String temp = scanner.nextLine();
            menu = Integer.parseInt(temp); //-> 알파벳 등을 기입해서 오류가 나는걸 방지하지 못하는데 왜 nextLine으로 입력 받고 다시 형변환 해주는걸까?
            // nextInt() -> 안쓰는 이유? -> Enter 키의 입력 문제로 인하여 이후 수를 입력받을 때의 오류를 고려하여 nextLine()으로 입력받고 다시 파싱해주는것이 좋은듯 하다

            if (menu == 0) {
                System.out.println("End");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("Wrong Menu");
                continue;
            }

            System.out.println("You choose : " + menu);
        }
    }
}
