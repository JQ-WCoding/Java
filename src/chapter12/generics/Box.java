package chapter12.generics;

import java.util.ArrayList;

public class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        // ArrayList 의 <T> 제네릭스도 같아짐
        list.add(item); // 해당 형태의 객체를 입력
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    ArrayList<T> getList() {
        return list;
    }
}
