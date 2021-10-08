package chapter11.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(100000);
        LinkedList linkedList = new LinkedList();

        // 값 등록해두기
        add(arrayList);
        add(linkedList);

        // 모든 값을 한번씩 확인하고 돌아오는 시간 출력
        System.out.println("access time");
        System.out.println("AL : " + access(arrayList));
        System.out.println("LL : " + access(linkedList));
        // ArrayList 가 월등히 빠르다
    }

    static void add(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i + "");
        }
    }

    static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
