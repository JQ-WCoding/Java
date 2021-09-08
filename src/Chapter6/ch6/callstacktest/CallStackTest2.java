package Chapter6.ch6.callstacktest;

public class CallStackTest2 {
    public static void main(String[] args) {
        // 스택이 쌓이고 종료되는 시점을 알아보기 위한 작업
        System.out.println("Main Start"); // 메인문 시작
        first(); // first 메소드를 호출 -> first 메소드로 이동
        System.out.println("Main End"); // first()이후 -> 메인문 종료
    }

    static void first(){
        // main의 first() 메소드와 만나 진입
        System.out.println("First start"); // first 시작
        second(); // fisrt 시작 후 -> second() 메소드로 이동
        System.out.println("First End"); // -> second() 완료 후 돌아와 진행 / first 종료
    }

    static void second(){
        // first() -> second()를 통해 진입
        System.out.println("Second Start"); // second 시작
        System.out.println("Second End"); // second 종료
    }
}
