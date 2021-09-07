package Chapter3.ch3.OperatorEx;

public class OperatorEx24 {
    public static void main(String[] args) {
        int a = 0;
        char ch = ' ';

        a = 10;
        // 2자리 10진법으로 표현하며 대소 비교의 결과 표현
        System.out.printf("a = %2d, 10 < a && a < 20 = %b%n", a, 10 < a && a < 20);

        a = 6;
        /*
         a를 2로 나누었을 때 나머지가 0이거나 a를 3으로 나누었을 때 나머지가 0이고 a를 6으로 나누었을 때 나머지가 0이 아닌경우
         && || 두가지 경구 && 연산자가 더 우선권을 가지기에 a % 2 == 0 || (a % 3 == 0 && a % 6 != 0)와 동일한 표현이 된다
         -> 마지 곱하기 나누기 같은 현상
         */
        System.out.printf("a = %2d, a%%2 == 0 || a %% 3 == 0 && 6!= 0 = %b%n", a, a % 2 == 0 || a % 3 == 0 && a % 6 != 0);
        // ()를 다르게 묶어 새롭게 표현
        System.out.printf("a = %2d, (a%%2 == 0 || a %% 3 == 0) && 6!= 0 = %b%n", a, (a % 2 == 0 || a % 3 == 0) && a % 6 != 0);

        // char형으로 초기화한 4문자에 대해 값 비교
        ch = '4';
        System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0' <= ch && ch <= '9');
        // 대소문자 나눠서 문자의 크기 비교
        ch = 'd';
        System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a' <= ch && ch <= 'z');

        ch = 'D';
        System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b%n", ch, 'A' <= ch && ch <= 'Z');
        // 해당 q는 대문자와 소문자의 상관없이 비교 가능
        ch = 'q';
        System.out.printf("ch='%c', ch=='q' || ch == 'Q' =%b%n", ch, ch == 'q' || ch == 'Q');
    }
}
