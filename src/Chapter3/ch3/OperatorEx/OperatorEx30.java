package Chapter3.ch3.OperatorEx;

public class OperatorEx30 {
    public static void main(String[] args) {
        // -> 동일문장이 겹처 method를 생성하여 사용
        int eight = 8;
        check(eight);

        // 해당 변수를 -8로 지정
        eight = -8;
        check(eight);

        eight = 8;
        System.out.printf("%d >> %2d = %4d \t %s%n", eight, 0, eight >> 0, toBinaryString(eight >> 0));
        // 32 칸을 이동하면 제자리로 돌아온다 -> 즉 2진수로 32칸을 사용가능하다
        System.out.printf("%d >> %2d = %4d \t %s%n", eight, 32, eight >> 32, toBinaryString(eight >> 32));
    }

    private static void check(int eight) {
                /*
        쉬프트 연산자
        >> << 등의 표기를 통해 2진수의 자리를 몇번 옮길지 결정하는 방법
         */
        // 0만큼 옮기다 -> 숫자의 자리를 옮기지 않았다
        System.out.printf("%d >> %d = %4d \t %s%n", eight, 0, eight >> 0, toBinaryString(eight >> 0));
        // 1만큼 옮기다 -> 자릿수를 오른쪽으로 한자리 옮기다
        System.out.printf("%d >> %d = %4d \t %s%n", eight, 1, eight >> 1, toBinaryString(eight >> 1));
        // 2만큼 옮기다 -> 자릿수를 오름쪽으로 두자리 옮김
        System.out.printf("%d >> %d = %4d \t %s%n", eight, 2, eight >> 2, toBinaryString(eight >> 2));
        /*
        오른쪽과 반대인 왼쪽으로 자리를 옮기는 과정
        0, 1, 2의 자리수를 옮기는 3번의 과정
         */
        System.out.printf("%d << %d = %4d \t %s%n", eight, 0, eight << 0, toBinaryString(eight << 0));
        System.out.printf("%d << %d = %4d \t %s%n", eight, 1, eight << 1, toBinaryString(eight << 1));
        System.out.printf("%d << %d = %4d \t %s%n", eight, 2, eight << 2, toBinaryString(eight << 2));

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
