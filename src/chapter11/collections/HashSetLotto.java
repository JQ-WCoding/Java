package chapter11.collections;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            // 랜덤한 숫자 1 ~ 45까지 입력
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        // LinkedList 객체로 인스턴스화 -> 저장한 값의 순서를 유지하기 위해 그리고 중복 제거
        List list = new LinkedList(set);
        // 정렬
        Collections.sort(list);
        System.out.println(list);
    }
}
