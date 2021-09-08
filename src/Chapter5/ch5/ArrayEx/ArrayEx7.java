package Chapter5.ch5.ArrayEx;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        // 0 ~ 9 까지 값 입력하기
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i] + " ");
        }
        System.out.println();

        // 배열의 값 섞는 과정
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10);
            // 임의의 int형 저장소 temp를 이용하여 배열의 값을 변경 -> 0 ~ 9까지 랜던함 숫자를 매번 새롭게 찾아 계속 변경
            int temp = numArr[0];
            numArr[0] = numArr[num];
            numArr[num] = temp;
        }

        for (int i : numArr) {
            System.out.print(i + " ");
        }
    }
}
