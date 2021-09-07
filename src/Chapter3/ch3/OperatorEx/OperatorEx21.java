package Chapter3.ch3.OperatorEx;

public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("11 == 11.0f \t %b%n", 11 == 11.0f);
        System.out.printf("'0' == 0 \t %b%n", '0' == 0);
        System.out.printf("'B' == 66 \t %b%n", 'B' == 66);
        System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
        // A 66 B 67
        System.out.printf("'A'+1 != 'B' \t %b%n", 'A' + 1 != 'B');
    }
}
