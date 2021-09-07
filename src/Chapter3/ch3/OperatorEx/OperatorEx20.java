package Chapter3.ch3.OperatorEx;

public class OperatorEx20 {
    public static void main(String[] args) {
        System.out.println(-10 % 6);
        System.out.println(10 % -6);
        System.out.println(-10 % -6);
        /*
        1. 나머지가 있는 경우 -> 이해하기 쉽게 가는 방법 -> -6 * 1 = -6 이고 나머지 -4가 부족하다
        2. -6 * -1 + 4 = 10 임으로 나머지 4가 부족하기에 값은 4
        3. -6 * 1 - 4 = -10 이기에 -4가 부족하다
         */
    }
}
