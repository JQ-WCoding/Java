package chapter9.langPackage;

import java.util.Arrays;

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // arr 배열을 복사하여 arrClone 배열에 초기화 한다
        int[] arrClone = arr.clone();
        // 복사한 arrClone 배열의 0번째는 6으로 초기화
        arrClone[0] = 6;

        // 복사한 값 확인
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));

        // 추가 사항
        // clone() 은 주소는 복사하지 않고 해당 값들만 복사한다
        System.out.println(arr.hashCode());
        System.out.println(arrClone.hashCode());
    }
}
