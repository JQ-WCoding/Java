package Chapter3.ch3.OperatorEx;

public class OperatorEx14 {
    public static void main(String[] args) {
        // 26개 출력하는 이유 -> 알파벳 끝이어서
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(a++);
        }
        System.out.println();

        // Z -> 다음 문자도 출력됨
        a = 'A';
        for (int i = 0; i < 27; i++) {
            System.out.print(a++);
        }
        System.out.println();

        a = '0';
        for (int i = 0; i < 10; i++) {
            System.out.print(a++);
        }
        System.out.println();
    }
}
