package Chapter5.ch5.ArrayEx;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        // 임의의 숫자 입력하기 0 ~ 10까지
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * numArr.length); // 10 -> numArr.length 로 변경해봄
            System.out.print(numArr[i]);
        }
        System.out.println();

        // numArr의 값을 모두 확인하며 해당 값에 1씩 증가하도록 한다.
        for (int i : numArr) {
            counter[i]++;
        }
        // 0 ~ 9 까지의 개수를 확인할 예정
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    }
}
