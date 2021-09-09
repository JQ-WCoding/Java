package Chapter6.ch6.recursiveCall;

public class MainTest {
    public static void main(String[] args) {
        main(null); // 재귀호출
        // main 의 인자값으로 null(값 없음)을 통해 main()내의 main()내의 main().....무한히 호출한다 -> 실행시 StackOverFlow까지 진행하다 종료
    }
}
