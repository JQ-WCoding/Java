package Chapter2.ch2.CastingEx;

public class CastingEx2 {
    public static void main(String[] args) {
        // int -> byte로 형변환
        int iNum = 20;
        byte bNum = (byte) iNum;
        // 출력 (작은 수라 값 손실 확률이 적을듯)
        System.out.printf("[int -> byte] iNum = %d -> bNum = %d%n", iNum, bNum); //-> 손실 X

        // 값을 450으로 실험 해보기
        iNum = 450;
        bNum = (byte) iNum;
        System.out.printf("[int -> byte] iNum = %d -> bNum = %d%n", iNum, bNum); // -> byte로 변환시 값 손실이 발생

        bNum = 20;
        iNum = (int) bNum;
        System.out.printf("[byte -> int] bNum = %d -> iNum = %d%n", bNum, iNum);

        /*
        450 값을 초기화 하려하니 byte는 애초에 크기가 안맞아서 오류
         */
        bNum = -1;
        iNum = (int) bNum;
        System.out.printf("[byte -> int] bNum = %d -> iNum = %d%n", bNum, iNum);

        // String으로 변환하여 표현해보기
        System.out.println("iNum = " + Integer.toBinaryString(iNum));
    }
}
