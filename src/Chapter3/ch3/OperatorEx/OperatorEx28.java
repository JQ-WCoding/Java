package Chapter3.ch3.OperatorEx;

public class OperatorEx28 {
    public static void main(String[] args) {
        int a = 0xAB, b = 0xF;

        System.out.printf("a = %#X \t\t %s%n", a, toBinaryString(a));
        System.out.printf("b = %#X \t\t %s%n", b, toBinaryString(b));
        // a 또는 b이기에 a와 b중 하나라도 1의 값을 가진다면 1로 표기한다
        System.out.printf("%#X | %#X = %#X \t %s%n", a, b, a | b, toBinaryString(a | b));
        // a 와 b이기에 a와 b중 하나라도 0의 값을 가지면 0으로 표현된다
        System.out.printf("%#X & %#X = %#X \t %s%n", a, b, a & b, toBinaryString(a & b));
        // xor 연산자는 둘의 값이 다를 때만 1이되고 같을 경우 0으로 표현
        System.out.printf("%#X ^ %#X = %#X \t %s%n", a, b, a ^ b, toBinaryString(a & b));
        // 같은걸 3번 해보기
        System.out.printf("%#X ^ %#X ^ %#X = %#X \t %s%n", a, b, b, a ^ b ^ b, toBinaryString(a ^ b ^ b));

    }

    private static Object toBinaryString(int a) {
        // zero 변수를 사용하여 2진법을 표현하기 위한 바탕을 만든다
        String zero = "00000000000000000000000000000000000000000000000000000000000";
        // temp 변수를 통해 0000000... + a의 값을 추가 한다
        String temp = zero + Integer.toBinaryString(a);
        // 0 ~ (temp의 길이 - 32) 만큼을 잘라 보낸다
        return temp.substring(temp.length() - 32);
    }
}
