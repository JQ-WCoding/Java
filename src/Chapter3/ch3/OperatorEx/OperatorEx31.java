package Chapter3.ch3.OperatorEx;

public class OperatorEx31 {
    public static void main(String[] args) {
        int num = 1234;
        int hexNum = 0xABCD;
        int maskNum = 0xF;

        System.out.printf("hexNum = %X%n", hexNum);
        System.out.printf("%X%n", hexNum & maskNum);

        /*
        4칸씩 이동하면서 점진적으로 숫자가 커져가는 갈까?
         */
        hexNum = hexNum >> 4;
        System.out.printf("%X%n", hexNum & maskNum);

        hexNum = hexNum >> 4;
        System.out.printf("%X%n", hexNum & maskNum);

        hexNum = hexNum >> 4;
        System.out.printf("%X%n", hexNum & maskNum);
    }
}
