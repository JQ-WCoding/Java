package chapter11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
    // 값 입력
    public Object push(Object obj) {
        addElement(obj);
        return obj;
    }

    // 값 출력 후 요소 삭제하기
    public Object pop() {
        // 임의의 객체를 생성 후 peek() 메소드를 통해 값을 가져오고 -> 해당 객체 삭제
        Object obj = peek();
        removeElementAt(size() - 1);
        return obj;
    }

    public Object peek() {
        // 객체 길이 만큼 정의
        int len = size();

        if (len == 0) { // 스텍이 비어있는 경우 오류
            throw new EmptyStackException();
        }

        // 해당 객체 가져오기 (삭제하기 않는다)
        return elementAt(len - 1);
    }

    public boolean empty() {
        // 사이즈가 0인가? -> true or false
        return size() == 0;
    }

    public int search(Object obj) {
        // 마지막 부터 순차적으로 해당 객체가 있는지 찾는 메소드
        int i = lastIndexOf(obj);

        // 0 보다 크면 -> 찾았다면
        // 전체 크기에서 찾은 인덱스 삭제
        if (i >= 0) {
            // 인덱스 반환
            return size() - i;
        }

        // 값을 찾지 못한 경우 -1로 반환
        return -1;
    }
}
