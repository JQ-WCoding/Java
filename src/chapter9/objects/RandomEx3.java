package chapter9.objects;

import java.util.Arrays;

public class RandomEx3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // getRandom() 값 출력
            System.out.print(getRandom(5, 10) + ",");
        }
        System.out.println();

        int[] result = fillRandomNum(new int[10], new int[]{2, 3, 4, 5});

        // Arrays.toString() 배열을 문자열로 출력
        System.out.println(Arrays.toString(result));
    }

    // 명칭을 통일하고 직관적으로 표현해두니 이해하기 더 쉬운거 같다 -> 참고해서 사용해야지
    static int[] fillRandomNum(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandom(from, to);
        }
        return arr;
    }

    static int[] fillRandomNum(int[] arr, int[] data) {
        // 처음부터 끝까지
        for (int i = 0; i < arr.length; i++) {
            arr[i] = data[getRandom(0, data.length - 1)];
        }
        return arr;
    }

    static int getRandom(int from, int to) {
        // abs() 절대값 / min() 최소값
        // 랜덤값 * 절대값 -> 결과 + 최소값
        return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
    }
}
