package Chapter4.ch4.FlowEx;

import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        outer:
        while (true) {
            System.out.printf("(1)apple \n(2)banana \n(3)orange \nchoose(1~3) / (to End press 0) ");

            String temp = scanner.nextLine();
            menu = Integer.parseInt(temp);

            if (menu == 0) {
                System.out.println("End");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("Wrong Menu");
                continue;
            }

            for (; ; ) {
                System.out.print("계산할 값을 입력하세요 : >>");
                temp = scanner.nextLine();
                num = Integer.parseInt(temp);

                if (num == 0) break; // 종료

                if (num == 99) break outer; // outer 반복문 전체 종료

                switch (menu) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num)); // 제곱근 계산 2의 2승, 4의 2승 등등 -> double형으로 반환
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num)); // log 함수
                        break;
                }

            }
        }
    }
}