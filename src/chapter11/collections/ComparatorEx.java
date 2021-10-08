package chapter11.collections;

import java.util.Arrays;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "dog", "lion", "tiger", "elephant"};

        Arrays.sort(strArr); // Comparable 에 의한 정렬
        System.out.println("strArr : " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 추가 인자값을 주어 대소문자 구분없이 사용하도록한다
        // CaseInsensitiveComparator
        // 정렬
        System.out.println("strArr : " + Arrays.toString(strArr));

        // sort 첫번째 인자는 배열 형태여야 하고 두번째 인자로는 Comparator 를 상속받은 객체여야한다
        // 내림차순
        Arrays.sort(strArr, new Descending());
        System.out.println("strArr : " + Arrays.toString(strArr));
    }
}
