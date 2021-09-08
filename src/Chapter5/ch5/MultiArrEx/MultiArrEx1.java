package Chapter5.ch5.MultiArrEx;

import java.util.Scanner;

public class MultiArrEx1 {
    public static void main(String[] args) {
        final int SIZE = 10; // 크기 -> 10 final로 선언하여 상수로 설정
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        // 판 만들기
        byte[][] shipBoard = {
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 0},
        };

        for (int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("좌표 입력 : >>");
            String location = scanner.nextLine();

            if (location.length() == 2) {
                x = location.charAt(0) - '0';
                y = location.charAt(1) - '0';

                if (x == 0 && y == 0) break;
            }

            if (location.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
                System.out.println("Wrong location");
                continue;
            }

            board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

            for (int i = 0; i < SIZE; i++) {
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
}
