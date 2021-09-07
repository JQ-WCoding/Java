package Chapter3.ch3.OperatorEx;

public class OperatorEx22 {
    public static void main(String[] args) {
        float fNum = 0.2f;
        double dNum = 0.2;
        double dNum2 = (double) fNum;

        // 10.0 과 10.0f가 같은지 즉 double형과 float형에서 뒤 소수자리가 같은 경우 같게 나오는가 비교하기 위함
        System.out.printf("10.0 == 10.0f %b%n", 10.0 == 10.0f);
        System.out.printf("0.2 == 0.2f %b%n", 0.2 == 0.2f); // -> false인 이유는 실수형은 소수점에서 근사값으로 저장되기 때문에 오차가 발생

        // double형으로 초기화 할때와 float형을 double로 형변환하여 초기화 할때 저장 값이 다른 이유는 저장 범위가 다르기 때문에 근사값으로 저장되어 값이 변질되는 것을 방지하기 때문
        // 19자리 수 중 소수점은 17자리까지 표현한다
        System.out.printf("f = %19.17f%n", fNum);
        System.out.printf("d = %19.17f%n", dNum);
        System.out.printf("d = %19.17f%n", dNum2);

        System.out.printf("dNum == fNum %b%n", dNum == fNum);
        System.out.printf("dNum == dNum2 %b%n", dNum == dNum2);
        System.out.printf("dNum2 == fNum %b%n", dNum2 == fNum);
    }
}
