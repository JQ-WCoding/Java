package Chapter2.ch2.PrintEx;

public class PrintfEx1 {
    public static void main(String[] args) {
        // 변수 b는 byte형으로 1로 초기화
        byte b = 1;
        // 변수 s는 short형으로 1로 초기화
        short s = 2;
        // 변수 c는 char형으로 'A'로 초기화
        char c = 'A';

        // 정수형 ten 변수에 10 초기화
        int ten = 10;
        // bigNum에는 1000으로 초히화
        long bigNum = 100_000_000_000L;
        // long형 변수 hex에는 16진수로 값 초기화
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        // octNum은 int형으로 8진수 자리 10의 값으로 초기화
        int octNum = 010;
        // hexNum은 16진수 10의 값으로 초기화
        int hexNum = 0x10;
        // binNum은 2진수 10의 값을 초기화
        int binNum = 0b10;

        // 출력문이 printf 메소드를 사용하였기에 한줄에 모두 표현된다 -> 줄바꿈을 하기 위해 %n을 추가적으로 작성
        // %d는 변수 b의 값을 출력하기 위한 지시자
        System.out.printf("b=%d%n", b);
        // short s를 출력하기 위한 지시자로 %d 사용 -> 10진 정수의 형식으로 출력시킨다
        System.out.printf("s=%d%n", s);
        System.out.println(s);
        // c변수는 char형 이지만 (int) 형변환을 통해 정수로 몇인지(아스키코드)로 표현
        System.out.printf("c=%c, %d %n", c, (int) c);
        // ten의 값에서 5자리 수까지 표현할 경우
        System.out.printf("ten = [%5d]%n", ten); // 출력시 1빈자릿 수도 출력되어 표시된다
        System.out.printf("ten = [%-5d]%n", ten);
        System.out.printf("ten = [%05d]%n", ten);
        // bigNum 변수에 정수형으로 표현
        System.out.printf("bigNum = %d%n", bigNum);
        System.out.printf("hex=%#x%n", hex); // '#'은 접두사
        // octNum을 8진수와 10진수로 모두 표현하여 출력
        System.out.printf("octNum = %o, %d%n", octNum, octNum);
        System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);
        // 10진수를 2진수로 출력해주는 지시자가 없기에, 정수를 2진 문자로 변환 -> Integer.toBinaryString(int i)를 사용하여 문자열로 반환하고 다시 %s를 사용하여 출력
        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}
