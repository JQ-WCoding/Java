package Chapter3.ch3.OperatorEx;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 20;
        byte b = 40;
        byte c = (byte) (a * b);
        System.out.println(c); // -> 800이 나오기엔 byte의 크기를 초과해버림

        int d = (a * b);
        System.out.println(d); // int 받으면 문제 없이 가능 (수의 크기가 같기 때문에)
    }
}
