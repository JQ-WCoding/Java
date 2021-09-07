package Chapter3.ch3.OperatorEx;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 10, j = 0;

        j = i++; // -> 이 의미는 j를 먼저 초기화하고 값을 증가시키는 형태
        System.out.println("j = i++; 실행 후, i = " + i + " j = " + j);

        i = 10;
        j = 0;

        j = ++i; // -> 증가를 먼저 실시한 후 j에 초기화
        System.out.println("j = i++; 실행 후, i = " + i + " j = " + j);
    }
}
