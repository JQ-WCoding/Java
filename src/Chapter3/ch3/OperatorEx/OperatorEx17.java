package Chapter3.ch3.OperatorEx;

public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double smallPi = (int) (pi * 1000 + 0.5) / 1000.0;

        System.out.println(smallPi);
    }
}
