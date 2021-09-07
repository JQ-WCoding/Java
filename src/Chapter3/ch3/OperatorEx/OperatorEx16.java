package Chapter3.ch3.OperatorEx;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;

        float smallPi = (int) (pi * 1000) / 1000f;
        System.out.println(smallPi);
    }
}
