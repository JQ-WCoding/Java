package Chapter5.ch5.ArrayEx;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int x = 1;

        score[0] = 10;
        score[1] = 20;
        score[x + 1] = 30; // score[2]
        score[3] = 40;
        score[4] = 50;

        // int temp = score[3] + score[4]
        int temp = score[x + 2] + score[4];

        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d] : %d%n", i, score[i]);
        }

        System.out.printf("temp : %d%n", temp);
//        System.out.printf("score[%d] : %d%n", 7, score[7]); -> score의 범위를 벗어나 에러가 발생
    }
}
