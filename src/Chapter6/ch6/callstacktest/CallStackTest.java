package Chapter6.ch6.callstacktest;

public class CallStackTest {
    // 메인문 실행 (스택 가장 바닥에 쌓인다)
    public static void main(String[] args) {
        // one이라는 메소드를 만나 -> 콜스택 영역에 one 메소드가 다시 쌓인다 -> 즉 가장 상단에 쌓인 행동부터 실행
        one();
    }
    // static으로 전역으로 선언하였기 때문에 main 내에 추가적으로 객체를 생성하지 않았다
    static void one() {
        // main 문에서 one 메소드를 통해 다시 two 메소드를 만나 최상단에 two 메소드가 스택 영역에 쌓여졌다 -> 가장 상단이 현재 two() 임으로 two를 찾아간다
        two();
    }

    static void two() {
        // two 내부의 실행문
        System.out.println("two()"); // -> two() 메소드가 실행됨을 표현하는 출력문
        // two()메소드가 완료되면 다시 one()으로 쌓인 순서의 역순으로 내려가면서 메소드가 끝나면 main문으로 돌아와 종료된다
    }
}
