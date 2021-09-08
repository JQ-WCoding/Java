package Chapter5.ch5.ArrayEx;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 95, 84, 73, 60};

        // 간결하게 변경해봄
        for (int i : score) {
            sum += i;
        }

        average = sum / (float) score.length;

        System.out.println("Total : " + sum);
        System.out.println("Average : " + average);
    }
}
