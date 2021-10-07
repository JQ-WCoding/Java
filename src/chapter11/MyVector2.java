package chapter11;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator {
    int cursor = 0;
    int lastRet = -1;

    public MyVector2(int capacity) {
        super(capacity);
    }

    public MyVector2() {
        this(10);
    }

    @Override
    public boolean hasNext() {
        return cursor != size;
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }

    public String toString() {
        String temp = "";
        Iterator iterator = iterator();

        for (int i = 0; iterator.hasNext(); i++) {
            if (i != 0) {
                temp += ", ";
            }
        }
        return "[" + temp + "]";
    }

    public Iterator iterator() {
        cursor = 0;
        lastRet = -1;
        return this; // 이건 그대로 인스턴스화된 MyVector2 를 반환한다는 뜻 -> 현재 클래스를 그대로 반환한다
    }

    public void remove() {
        if (lastRet == -1) {
            throw new IllegalStateException();
        } else {
            remove(lastRet);
            cursor--;
            lastRet = -1;
        }
    }

}
