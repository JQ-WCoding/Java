package chapter11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {
    // 멤버 변수이자 인스턴스 변수
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    // 하단 부는 List 인터페이스 상속으로 인한 메소드 구체화 (직접구현해보기)
    MyVector(int capacity) {
        // 생성자에서 capacity 값을 0보다 작게 준다면
        if (capacity < 0) {
            // 오류 문구 출력
            throw new IllegalArgumentException("Not allowed capacity : " + capacity);
        }
        // 아니라면 해당값으로 초기화
        this.capacity = capacity;
    }

    MyVector() {
        // 기본 생성자 -> 인스턴스화할 경우 기본 값을 10으로 초기화
        this(10);
    }

    // 크기 조정 -> 가장 적은 용량에 남는 부분이 있다면(minCapacity - data.length) -> setCapacity()를 통해 다시 크기 조정
    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0) {
            setCapacity(minCapacity);
        }
    }


    @Override
    public int size() {
        // 데이터의 크기로 돌려보낸다 -> 새롭게 지정해봄
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        // size 해당 vector 의 크기가 0인가?
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        // 만약 같은 값이 있다면 속해 있는 상태니 true 를 반환
        for (int i = 0; i < size; i++) {
            if (data[i] == o) {
                return true;
            }
        }
        // 반복문 동안 확인하지 못했다면, false 반환
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        // 크기조정을 통해 추가로 하나 더 늘린다
        ensureCapacity(size + 1);
        data[size++] = o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                remove(i); // 하나 삭제하고 바로 true 반환
                return true;
            }
        }
        // 반복문 내에 하나도 없다면 false 반환
        return false;
    }

    // addAll()이 표현하고 싶어하는 방향성이 무엇일까?
    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        // 해당 크기 만큼 모든 data 의 값을 null 로 초기화하고 size 는 0으로 초기화한다
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public Object get(int index) {
        // index 의 범위가 변수의 크기 범위를 초과하거나 미달인 경우
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("out of bounds");
        }
        return data[index];
    }

    @Override
    public Object set(int index, Object element) {
        data[index] = element;
        return data;
    }

    @Override
    public void add(int index, Object element) {
        setCapacity(size + 1);
//        for (int i = index; i < size; i++) {
//            data[i] =
//        }
//        data[index] = element;
    }

    @Override
    public Object remove(int index) {
        Object oldObj = null;

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("out of bounds");
        }
        oldObj = data[index];

        if (index != size - 1) {
            System.arraycopy(data, index + 1, data, index, size - index - 1);
        }

        data[size - 1] = null;
        size--;
        return oldObj;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // 출력을 위한 배열화
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    private void setCapacity(int capacity) {
        // 동일한 값이라면 단순 종료
        if (this.capacity == capacity) {
            return;
        }
        // 새로운 크기의 객체를 만들고 data 변수의 값을 temp 에 똑같이 초기화한다
        Object[] temp = new Object[capacity];
        System.arraycopy(data, 0, temp, 0, size);
        // data 를 temp 로 초기화
        data = temp;
        // 인자값으로 받은 capacity 의 값으로 초기화
        this.capacity = capacity;
    }
}
