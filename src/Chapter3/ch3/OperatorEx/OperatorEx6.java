package Chapter3.ch3.OperatorEx;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 15;
        byte b = 20;
        /*
         byte c = a + b; -> 컴파일 에러가 발생
         int형(4byte)의 값을 1byte의 변수에 저장하려 했기에 에러가 발생 -> a+b는 byte형이 아닌 int형
         */
        byte c = (byte) (a + b);
        System.out.println(c);
    }
}
