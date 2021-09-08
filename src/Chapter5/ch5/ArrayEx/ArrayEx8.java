package Chapter5.ch5.ArrayEx;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[50]; // 50개

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        // 값 변경을 위한 temp 변수 선언
        int temp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 50);
            temp = ball[j];
            // 공 0 ~ 5까지만 변경하며 변경값은 0 ~ 49  내의 값을 사용
            ball[i] = ball[j];
            ball[j] = temp;
        }

        // 6개 요소 출력
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }

    }
}
