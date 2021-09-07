package Chapter3.ch3.OperatorEx;

public class OperatorEx27 {
    public static void main(String[] args) {
        // boolean형 bool을 통해 true로 초기화
        boolean bool = true;
        char ch = 'D';
        // !을 이용해 true를 false로 변경
        System.out.printf("bool = %b%n", bool);
        System.out.printf("!bool = %b%n", !bool);
        // !!을 두번 사용하면 다시 참으로 돌아올까? -> yes
        System.out.printf("!!bool = %b%n", !!bool);
        // !!!을 세번 사용하면 다시 거짓으로? -> yes
        System.out.printf("!!!bool = %b%n", !!!bool);
        System.out.println();

        System.out.printf("ch = %c%n", ch);
        // ch 'D' 대문자 d는 소문자 a보다 작거나 z보다 큰 곳에 속하는가?
        System.out.printf("ch < 'a' || ch >'z' = %b%n", ch < 'a' || ch > 'z');
        // 소문자 a ~ z 사이에 속하지 않는가?
        System.out.printf("!('a' <= ch && ch <= 'z') = %b%n", !('a' <= ch && ch <= 'z'));
        // 소문자 a ~ z 사이에 속하는가?
        System.out.printf("'a' <= ch && ch <= 'z' = %b%n", 'a' <= ch && ch <= 'z');
    }
}
