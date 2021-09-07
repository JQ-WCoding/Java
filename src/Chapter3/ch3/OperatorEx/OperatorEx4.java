package Chapter3.ch3.OperatorEx;

public class OperatorEx4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; // 의미 없는 행동 -> 부호연산자 '+'는 하는 일이 없음 -10 * 1 = -10인거와 같은 원리
        System.out.println(i);

        i = -10;
        i = -i; // -10 * -1 = 10이되어 정수가 되는 원리
        System.out.println(i);
    }
}
