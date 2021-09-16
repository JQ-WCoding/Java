package chapter9.langPackage;

public class MathEx1 {
    public static void main(String[] args) {
        double val = 17.8934;
        System.out.println("round(" + val + ") = " + Math.round(val)); // round() 반올림 -> 소수자리 첫번째에서 바로 반올림한다 17.8 반올림 -> 18

        val *= 100;
        System.out.println("round(" + val + ") = " + Math.round(val)); // 1789.34 -> 반올림시 -> 1789

        System.out.println("round(" + val + ")/100 = " + Math.round(val) / 100); // 1789 / 100 이니 몫 17이 나옴
        System.out.println("round(" + val + ")/100.0 = " + Math.round(val) / 100.0); // 몫을 소수점까지 표현 (float)

        System.out.println();

        System.out.printf("ceil(%3.1f) = %3.1f%n", 1.1, Math.ceil(1.1)); // Math.ceil() -> 올림 / %3.1f -> 3자리수 중 소수점은 1자리 표현
        System.out.printf("floor(%3.1f) = %3.1f%n", 2.9, Math.floor(2.9)); // Math.floor() -> 내림

        System.out.printf("round(%3.1f) = %d%n", 3.1, Math.round(3.1)); // Math.round() -> 반올림 / Math.round 를 정수형으로 형변환이 필요
        System.out.printf("round(%3.1f) = %d%n", 3.8, Math.round(3.8));

        System.out.printf("rint(%3.1f) = %f%n", 3.5, Math.rint(3.5)); // rint() -> 매개변수와 가장 가까운 정수값을 double 형으로 형변환 하여 반환
        System.out.printf("round(%3.1f) = %d%n", -3.5, Math.round(-3.5)); // 절대값:   -> -3

        // 궁금해서 실험
        System.out.println(Math.round(-0.5));
        System.out.println(Math.round(-0.6));

        System.out.printf("rint(%3.1f) = %f%n", -3.5, Math.rint(-3.5));
        System.out.printf("ceil(%3.1f) = %f%n", -3.5, Math.ceil(-3.5));
        System.out.printf("floor(%3.1f) = %f%n", -3.5, Math.floor(-3.5));
        /*
        음수일 경우
        round() -> .0 의 자리 숫자가 5이면 반올림
        rint() -> 0.5 미만일때 더 큰값으로 반올림
         */
    }
}
