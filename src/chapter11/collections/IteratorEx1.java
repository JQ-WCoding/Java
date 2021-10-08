package chapter11.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorEx1 {
    public static void main(String[] args) {
        // 입력 받은 순서대로 32145 순으로 값 입력 및 출력
        ArrayList list = new ArrayList();
        list.add("3");
        list.add("2");
        list.add("1");
        list.add("4");
        list.add("5");

        // Iterator 형으로 변환
        Iterator iterator = list.iterator();

        // iterator 가 해당 인덱스 다음 값이 존재하는 한 계속 반복 및 출력
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
        // 결국 iterator 를 출력한 것과 동일하다
        System.out.println("===========set vs list==============");

        // set 의 경우 입력 순서가 지켜지지 않고 12345 순으로 출력
        Set set = new TreeSet();
        set.add("3");
        set.add("2");
        set.add("1");
        set.add("4");
        set.add("5");

        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}
