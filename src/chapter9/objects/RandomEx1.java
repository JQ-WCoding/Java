package chapter9.objects;

import java.util.Random;

public class RandomEx1 {
    public static void main(String[] args) {
        Random random1 = new Random(1); // seed 값 인자값으로 보내기
        Random random2 = new Random(1);

        // 난수 저장용
        int[] check1 = new int[3];
        int[] check2 = new int[3];

        // 시드 값이 같은 경우 같은 난수가 나오는지 파악하기 위해
        System.out.println("random : ");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " : " + random1.nextInt()); // int 형 난수 출력
            check1[i] = random1.nextInt();
        }
        System.out.println();
        System.out.println("random2 : ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " : " + random2.nextInt());
            check2[i] = random2.nextInt();
        }

        // 두 난수 배열 비교해보기 위한 반복문
        for (int i = 0; i < 3; i++) {
            System.out.println(check1[i] == check2[i]);
        }

    }
}
