package Chapter2.ch2.FloatEx;

public class FloatToBinEx {
    public static void main(String[] args) {
        // float형 fNum변수를 int형 num에 int타입으로 반환하여 초기화 (현재 fNum은 소수점 7자리까지 표현되어 있다.)
        float fNum = 1.1234567f;
        int iNum = Float.floatToIntBits(fNum);

        System.out.printf("%f%n", fNum);
        // 16진수로 표현
        System.out.printf("%X%n", iNum);
    }
}
