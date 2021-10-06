package chapter11;

import java.util.Stack;

public class StackEx1 {
    // 앞 뒤로 가기 스택
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1. Naver");
        goURL("2. Google");
        goURL("3. Daum");
        goURL("4. Yahoo");

        printStatus();

        goBack();
        System.out.println("뒤로가기");
        printStatus();

        goBack();
        System.out.println("뒤로가기");
        printStatus();

        goForward();
        System.out.println("앞으로가기");
        printStatus();

        goURL("github.com");
        System.out.println("New Address");
        printStatus();
    }

    public static void goURL(String url) {
        // back stack 에 url 값 저장
        back.push(url);

        if (!forward.empty()) { // 앞으로가기 버튼에 값이 더 존재한다면
            // 전부 삭제
            forward.clear();
        }
    }

    public static void printStatus() {
        // back 에 쌓여있는 스택 확인
        System.out.println("back : " + back);
        // forward 에 쌓여있는 스택 확인
        System.out.println("forward : " + forward);
        // 현재에선 back.peek() 가장 마지막에 들어온 값 가져오기
        System.out.println("now : " + back.peek());
        System.out.println();
    }

    public static void goForward() {
        // forward 가 비어있지 않다면 -> 실행가능
        if (!forward.empty()) {
            // back 스택에 forward 가장 최근 값을 출력해서 값으로 입력하고 forward 에선 삭제한다
            back.push(forward.pop());
        }
    }

    public static void goBack() {
        if (!back.empty()) {
            forward.push(back.pop());
        }
    }
}
