package Chapter2.ch2.CastingEx;

public class CastingEx3 {
    public static void main(String[] args) {
        // float은 6자리 표현과 7자리 미표현을 위해 소수점은 항상 7자리 이상으로 만들어 실험중
        float fNum = 1.1234567f;
        double dNum1 = 1.1234567;
        double dNum2 = (double) fNum;

        // 총 20자리 중 소숫점 자리는 18자리까지 표현할 예정
        System.out.printf("fNum = %20.18f\n", fNum);
        System.out.printf("dNum1 = %20.18f\n", dNum1);
        System.out.printf("dNum2 = %20.18f\n", dNum2);
    }
}
