package chapter11.collections;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] deepArr = {{11, 12, 13}, {21, 22, 23}};

        System.out.println("arr = " + Arrays.toString(arr)); // Arrays.toString() 메소드를 통해 1차원 배열 arr 출력
        System.out.println("deepArr.toString() = " + Arrays.toString(deepArr)); // 2차원 배열들의 주소값를 각각 출력
        System.out.println("deepArr.deepToString() = " + Arrays.deepToString(deepArr)); // 2차원 배열을 출력하기 위해선 deepToString()이 필요

        // 1 차원 배열 값 복사 방법
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        // 초과되는 크기의 배열에는 int 형의 default 인 0으로 초기화
        int[] arr4 = Arrays.copyOf(arr, 7);
        // copyOfRange() 2이상 4미만 인덱스 범위의 값만 복사 -> 전부 이상 미만의 기준이 많음
        int[] arr5 = Arrays.copyOfRange(arr, 1, 3);
        int[] arr6 = Arrays.copyOfRange(arr, 3, 7);

        System.out.println("arr2 : " + Arrays.toString(arr2));
        System.out.println("arr3 : " + Arrays.toString(arr3));
        System.out.println("arr4 : " + Arrays.toString(arr4));
        System.out.println("arr5 : " + Arrays.toString(arr5));
        System.out.println("arr6 : " + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        // arr7 배열을 9인 값으로 전부 채우는 메소드
        /*
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
        전부 일괄적인 값으로 초기화
         */
        Arrays.fill(arr7, 9);
        System.out.println("arr7 : " + Arrays.toString(arr7));

        // arr7 배열의 모든값을 1 ~ 6 사의 값으로 초기화
        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);
        System.out.println("arr7 : " + Arrays.toString(arr7));

        // 2차원 배열
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        // 2차원 String 선언에선 값이 다르게 취급하나??
        String[][] str2D3 = {{"ccc", "ddd"}, {"CCC", "DDD"}};
        String[][] str2D4 = {{"ccc", "ddd"}, {"CCC", "DDD"}};

        // 2차원의 1차원 주소들이 동일한지 확인하는 메소드
        System.out.println(Arrays.equals(str2D, str2D2)); // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
        System.out.println();

        System.out.println("===address check===");
        System.out.println(Arrays.equals(str2D3, str2D4));
        System.out.println(Arrays.toString(str2D3)); // 왜 두 주소가 다르지? 값이 같으면 스트링 풀에 의해 같아져야하는거 아닌가?
        System.out.println(Arrays.toString(str2D4)); // 뭐라 검색해야할까
        System.out.println();

        char[] chrArr = {'C', 'D', 'A', 'B', 'E'}; // 문자배열

        System.out.println("chArr : " + Arrays.toString(chrArr));
        System.out.println("index of B : " + Arrays.binarySearch(chrArr, 'B')); // binarySearch() 첫번째 인자값으로 받은 배열 내에서 'B' 같을 찾아 인덱스 값을 반환
        System.out.println("-- Sorting --");
        Arrays.sort(chrArr); // 정렬
        System.out.println("chArr : " + Arrays.toString(chrArr)); // 정렬 후 재 출력
        System.out.println("index of B : " + Arrays.binarySearch(chrArr, 'B')); // 정렬 후, 'B'의 인덱스 값 변화 확인하기
    }
}
