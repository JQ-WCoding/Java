package Chapter3.ch3.OperatorEx;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        // Math.round() 반올림 하는 Math 객체의 round()메소드를 사용 -> 1000.0 을 이용하여 float형으로 소수점 자리수를 표현한다
        double smallPi = Math.round(pi * 1000) / 1000.0;

        System.out.println(smallPi);
    }
}
