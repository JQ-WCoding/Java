package Chapter2.ch2.CastingEx;

public class CastingEx4 {
    public static void main(String[] args) {
        int iNum = 912345678; // 9자리
        // iNum값을 fNum에 float형으로 형변환
        float fNum = (float) iNum;
        int iNum2 = (int) fNum;

        double dNum = (double) iNum;
        int iNum3 = (int) dNum;

        float fNum2 = 1.123f;
        int iNum4 = (int) fNum2;

        System.out.printf("iNum = %d\n", iNum);
        System.out.printf("f = %f, iNum2 = %d\n", fNum, iNum2);
        System.out.printf("d = %f, iNum3 = %d\n", dNum, iNum3);
        System.out.printf("(int) %f = %d\n", fNum2, iNum4);

    }
}
