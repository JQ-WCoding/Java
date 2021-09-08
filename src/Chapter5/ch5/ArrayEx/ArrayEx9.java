package Chapter5.ch5.ArrayEx;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int temp = (int) (Math.random() * code.length); // code[temp] 영역에서 사용하기 위해 최대 code 배열의 길이 만큼만 사용해야 한다.
            arr[i] = code[temp];
        }
        // 배열 출력문
        System.out.println(Arrays.toString(arr));
    }
}
