package chapter11.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        // Stack 은 구현체 클래스
        Stack stack = new Stack();
        // Queue 는 인터페이스로만 제공
        Queue queue = new LinkedList();

        // stack 에선 push()를 통해 값 입력
        stack.push("1");
        stack.push("2");
        stack.push("3");

        // queue 에선 offer()를 통해 값 입력
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");

        // LIFO (Last In First Out)
        System.out.println("Stack : ");
        // stack 이 값이 없어지는 순간까지
        while (!stack.empty()) {
            // Stack 의 경우, pop() -> 값을 출력한 후, 삭제한다
            System.out.println(stack.pop());
        }

        // FIFO (First In First Out)
        System.out.println("Queue : ");
        // queue 값이 없어지는 순간까지
        while (!queue.isEmpty()) {
            // Queue 의 경우, poll() -> 값을 출력하고 삭제한다 (꺼낸다고 표현)
            System.out.println(queue.poll());
        }
    }
}
