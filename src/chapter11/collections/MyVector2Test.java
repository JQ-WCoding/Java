package chapter11.collections;

import java.util.Iterator;

public class MyVector2Test {
    public static void main(String[] args) {
        // 10 capacity 를 가진 Vector 인스턴스화
        MyVector2 myVector2 = new MyVector2();
        myVector2.add("0");
        myVector2.add("1");
        myVector2.add("2");
        myVector2.add("3");
        myVector2.add("4");
        // 삭제 전 값을 추가한 기본 상태
        System.out.println("Before Delete : " + myVector2);

        // Iterator 를 통해 읽어들이는 과정
        Iterator iterator = myVector2.iterator();
        iterator.next();
        iterator.remove();
        iterator.next();
        iterator.remove();

        // 삭제 이후
        System.out.println("After Delete : " + myVector2);
    }
}
