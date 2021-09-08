package Chapter5.ch5.ArrayEx;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {80, 77, 100, 90, 54, 12, 45};

        // 초기값은 가장 첫번째 [0]의 값을 이용
        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            // 만약 해당 값이 최대값보다 크면 최대값을 변경해준다
            if (score[i] > max) {
                max = score[i];
            }
            // 만약 해당 값이 최소값보다 작으면 최고값을 변경해준다
            else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
