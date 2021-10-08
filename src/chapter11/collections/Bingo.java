package chapter11.collections;

import Chapter7.ch7.myInterface.interfaceTest2.I;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        // 저장 순서를 기억하고 있는 LinkedHashSet()이 더 좋은 선택일 확률이 높다
        Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            // 값 입력
            set.add((int) (Math.random() * 50) + 1 + "");
        }

        Iterator iterator = set.iterator(); // iterator 변환

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) iterator.next());
                // 띄어 쓰기 하나와 두개 차이 -> 1의 자리 수이면 숫자표현이 하나 부족함으로 띄어쓰기 두번해주기
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
