package Chapter3.ch3.OperatorEx;

public class OperatorEx11 {
    public static void main(String[] args) {
        /*
        아스키코드를 이용한 예제
        가까운 비교를 위해 a와 b를 사용하였음
         */
        char a = 'a';
        char b = 'b';

        char one = '1';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", b, a, b - a);
        System.out.printf("'%c' - '%c' = %d%n", two, one, two - one);
        System.out.printf("'%c' = %d%n", a, (int) a);
        System.out.printf("'%c' = %d%n", b, (int) b);
        System.out.printf("'%c' = %d%n", one, (int) one);
        System.out.printf("'%c' = %d%n", two, (int) two);
    }
}
