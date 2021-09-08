package Chapter5.ch5.ArrayEx;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = {100, 90, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 10) + 1;
        }

        // 반복문 표현 변경
        for (int i : arr1) {
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr2)); // Arrays.toString()을 이용해 주소값이 아닌 들어있는 값이 제대로 출력된다
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(arr3);
        System.out.println(chArr); // println의 char 배열에선 주소가 아닌 값이 제대로 출력된다 -> 그렇게 만들어짐
    }
}
