package chapter11.collections;

public class AsciiPrint {
    public static void main(String[] args) {
        char blank = ' ';

        for ( int i = 0; i < 95; i++ ) {
            // char 형 공백 이후 문자 95번까지 모두 출력 -> ascii 코드로 출력된다
            System.out.print( blank++ ); // 0 (공백) 1(!) .....
        }
    }
}
