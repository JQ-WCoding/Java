package chapter10.format;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};

        int[] scores = {100, 95, 83, 71, 62, 25};

        // 기준값과 성적을 인자값으로 준다
        ChoiceFormat choiceFormat = new ChoiceFormat(limits, grades);

        for (int score : scores) {
            // 값이 몇이며 해당 값을 형식에 맞게 표현할 경우는 ?
            System.out.println(score + " : " + choiceFormat.format(score));
        }
    }
}
