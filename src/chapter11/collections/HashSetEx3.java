package chapter11.collections;

import java.util.HashSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();


        set.add("abc");
        set.add("abc");

        set.add(new Person("Jun", 20));
        set.add(new Person("Jun", 20));

        // Set 의 특성상 중복되는 부분은 삭제하고 하나로 포함되어야 하지만 new Person() 은 생성자를 통해 다른 주소를 가진 값으로 두번 출력되는 문제점이 발생
        System.out.println(set);
    }
}
