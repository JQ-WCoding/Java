package chapter11.collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue queue = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help 입력 : ");

        // 반복문 내부에 선언된 문구들은 최대한 외부로
        Scanner scanner = new Scanner(System.in);
        // 입력받을 변수
        String input;
        //
        int i;
        LinkedList temp;
        ListIterator listIterator;

        while (true) {
            System.out.print(">>");
            try {
                // 값을 입력받고 나머지 나머지 빈칸은 모두 삭제한다 -> 양끝 빈칸은 전부 삭제
                input = scanner.nextLine().trim();

                if ("".equals(input)) continue; // 입력 받은 값이 빈칸인 경우 -> continue 를 통해 다시 반복문 처음부터 실행

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    // help 입력시, 출력되는 도움말 문구 -> 메뉴 사용법 같은 느낌
                    System.out.println("help - help you");
                    System.out.println("q or Q - Exit");
                    System.out.println("history - current history size : " + MAX_SIZE);
                } else if (input.equalsIgnoreCase("history")) {
                    // 입력 값이 history 인 경우 i 는 반복문 재진입마다 0으로 초기화
                    i = 0;
                    save(input);

                    // 임의의 LinkedList 객체를 queue 캐스팅하여 인스턴스화
                    temp = (LinkedList) queue;
                    // ListIterator 로 변환한 값을 listIterator 변수에 초기화
                    listIterator = temp.listIterator();

                    while (listIterator.hasNext()) {
                        // listIterator 값이 존재하는 한 i는 1씩 증가한 상태의 값을 출력 후 초기화
                        System.out.println(++i + "." + listIterator.next());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("input error");
            }
        }
    }

    public static void save(String input) {
        // queue 에 저장
        if (!"".equals(input)) {
            queue.offer(input);
        }

        // queue 의 크기가 MAX_SIZE (최대크기) 보다 커지면
        if (queue.size() > MAX_SIZE) {
            // 인자값이 없는 remove 의 경우 Retrieves and removes the head (first element) of this list.
            // 처음 입력받은 값을 삭제한다
            queue.remove();
        }
    }
}
