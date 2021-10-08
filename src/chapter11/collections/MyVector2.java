package chapter11.collections;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator {
    // 인덱스의 기능과 같이 값이 저장될 때마다 해당 위치(순서)를 파악하는 기준점
    int cursor = 0;
    // lastRet 은 마지막 저장된 최근 인덱스를 가져오는 변수
    int lastRet = -1;

    // 생성자
    public MyVector2(int capacity) {
        // 부모클래스 생성자를 사용
        super(capacity);
    }

    public MyVector2() {
        // 기본 capacity 인자값은 10
        this(10);
    }

    @Override
    public boolean hasNext() {
        // 현재 인덱스와 전체 크기가 다르다면 추가 값이 있다고 유추가능
        return cursor != size;
    }

    @Override
    public Object next() {
        // Vector 클래스의 get() 메소드
        Object next = get(cursor);
        // 커서 값으로 초기화한 후 커서 값은 1 증가
        lastRet = cursor++;
        // Object 타입으로 반환
        return next;
    }

    public String toString() {
        String temp = "";
        Iterator iterator = iterator();

        // Iterator 를 사용하여 가지고 있는 모든 값을 문자열로 반환
        for (int i = 0; iterator.hasNext(); i++) {
            if (i != 0) {
                temp += ", ";
            }
        }
        return "[" + temp + "]";
    }

    public Iterator iterator() {
        // Iterator 에선 cursor 와 lastRet 을 다시 초기화하고 this 반환
        cursor = 0;
        lastRet = -1;
        return this; //그대로 인스턴스화된 MyVector2 를 반환한다는 뜻 -> 현재 클래스를 그대로 반환한다
    }

    public void remove() {
        if (lastRet == -1) {
            // 이전 인덱스가 존재하지 않는다면 예외
            throw new IllegalStateException();
        } else {
            // 이전 인덱스의 값을 삭제하고
            remove(lastRet);
            // 커서 값을 하나 줄인 상태로 초기화 한다
            cursor--;
            // 이전의 값이 없어졌으므로, -1로 다시 초기화
            lastRet = -1;
        }
    }

}
