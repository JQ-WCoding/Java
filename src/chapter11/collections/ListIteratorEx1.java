package chapter11.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        // ArrayList 인스턴스에 12345 값 넣기
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // listIterator()는 new ListItr() 생성자를 통해 생성된 인스턴스를 반환하는 메소드이다
        ListIterator iterator = list.listIterator();

        // ListIterator 는 양방향 이동이 가능
        // 다음 값이 존재하는한 계속 반복
        // 반환 타입이 boolean
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        // 이전 값이 존재하는한 계속 반복
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println();
    }
}
