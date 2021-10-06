package chapter11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        // priority queue 객체를 Queue 참조형으로 인스턴화
        Queue pQueue = new PriorityQueue();

        // offer() 값 입력 -> 반환은 boolean 이다
        pQueue.offer(3);
        // 인자값을 new Integer 오토박싱 상태이다
        pQueue.offer(4);
        pQueue.offer(1);
        pQueue.offer(2);
        pQueue.offer(5);
        // 12345 순서대로 입력하지 않았지만 출력은 순서대로 된다
        System.out.println(pQueue);

        Object object; // Object object = null;

        // object 에 pQueue 의 값을 초기화하고 삭제하는 과정을 통해 값이 정상적으로 초기화 되었다면 출력해주는 반복문
        while ((object = pQueue.poll()) != null) {
            System.out.println(object);
        }

        // 책 실행 결과 값이 좀 이상한거 같다...
    }
}
