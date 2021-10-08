package chapter11.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedListTest {
    public static void main(String[] args) {
        // 충분히 넓은 공간을 선언하기
        ArrayList arrayList = new ArrayList(200000);
        LinkedList linkedList = new LinkedList();

        System.out.println("순차적 추가");
        System.out.println("AL : " + add1(arrayList));
        System.out.println("LL : " + add1(linkedList));
        System.out.println();

        System.out.println("중간 값 추가");
        System.out.println("AL : " + add2(arrayList));
        System.out.println("LL : " + add2(linkedList));
        System.out.println();

        // 순차적 삭제부터 실행 시, 값이 남아있지 않아 outOfBoundsException 발생
        System.out.println("중간 값 삭제");
        System.out.println("AL : " + remove2(arrayList));
        System.out.println("LL : " + remove2(linkedList));
        System.out.println();

        System.out.println("순차적 삭제");
        System.out.println("AL : " + remove1(arrayList));
        System.out.println("LL : " + remove1(linkedList));

        /*
        값의 범위에 따라 결과값에 오차가 존재!
         */
    }

    /*
    4가지 메소드는 모두 반복문이 모두 완료되는 시간을 측정하기 위한 메소드
    반환 타입은 long 형이다
     */
    static long add1(List list) { // 다형성 인터페이스 list 를 이용 ArrayList 와 LinkedList 중 어느것이 인자값을 주어져도 사용가능
        long start = System.currentTimeMillis();
        // 0 1 2 3 순차값을 list 에 추가
        for (int i = 0; i < 100000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long add2(List list) {
        long start = System.currentTimeMillis();
        // 같은 횟수동안 해당 인덱스에 값 저장
        for (int i = 0; i < 100000; i++) {
            list.add(500, "X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long remove1(List list) {
        long start = System.currentTimeMillis();
        // 삭제하기 -> 거꾸로 줄어드는 형식이 자리이동에 영향을 받지 않음
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long remove2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
