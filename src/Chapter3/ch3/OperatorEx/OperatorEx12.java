package Chapter3.ch3.OperatorEx;

public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1;
        // 아스키코드로 97 + 1 = 98, 98 + 1 = 99 의 형식으로 수가 증가하고 (char) 형변환을 통해 다시 알파벳으로 변경된다
        c3 = (char) (c1 + 1);
        c2++; // a -> b
        c2++; // b -> c

        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
