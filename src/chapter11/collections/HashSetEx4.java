package chapter11.collections;

import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        // HashSetEx3 과 동일 Person 클래스의 변화를 확인하기
        HashSet set = new HashSet();

        set.add("1234");
        set.add("1234");
        set.add(new Person("123", 10));
        set.add(new Person("123", 10));

        System.out.println(set);
    }
}
