package Chapter5.ch5.ArrayEx;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        // 값 등록하고 확인하기
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        // 값 변경 유무를 확인
        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;
            // 번호 내에 변경 될 경우 changed = true로 초기화 하여 반복문을 끝내고 그렇지 못한 경우 반복문 계속 실행 -> 결국 변경되는 순간이 올때까지 돌아감
            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true;
                }
            }

            if (!changed) break;

            for (int k : numArr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
