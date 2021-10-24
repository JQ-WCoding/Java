package chapter15.input_output;

import java.util.Date;

public class PrintStreamEx1 {
    public static void main(String[] args) {
        // ascii 코드로 65 = 'A'
        int i = 65;
        float f = 1234.56789f;

        Date date = new Date();

        // int 형 정수만 넣어도 formatter 를 이용해 자유롭게 진수 혹은 char 형과 같이 표현가능
        System.out.printf( "문자 %c 코드는 %d%n", i, i ); // int 형으로 65, char 형으로 'A'
        System.out.printf( "%d는 8진수 : %o, 16진수 : %x%n", i, i, i );
        // 정수형, 최대 3자리 숫자 -> 공백은 빈칸으로 채운다. 더 높은 자리 수를 작성하여도 출력은 가능
        System.out.printf( "%3d %3d %3d\n", 100, 90, 80000 );
        System.out.println();

        // System.out.println("123456789012345678901234567890");
        System.out.printf( "123456789012345678901234567890%n" );
        // s -> 문자열 표현 + 는 오른쪽 정렬, - 는 왼쪽 정렬
        System.out.printf( "%s%-5s%5s%n", "123", "456", "789" );
        System.out.println();

        // 지수 형태로 표현
        System.out.printf( "%-8.1f%8.1f %e%n", f, f, f );
        System.out.println();

        // %t 가 붙으면 time 을 의미 -> formatter 가 Date 의 값들을 표현
        System.out.printf( "오늘은 %tY년 %tm월 %td일 입니다.%n", date, date, date );
        System.out.printf( "지금은 : %tH시 %tM분 %tS초 입니다.%n", date, date, date );
        // 1$ 는 첫번째 매개변수를 의미 -> 해당 형식과 같이 동일 값을 위해 $를 사용하여 매개변수를 지정해줄 수 있다
        System.out.printf( "지금은 %1$tH시 %1$tM분 %1$tS초 입니다.", date );

    }
}
