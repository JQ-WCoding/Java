package chapter10.format;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        // 정규식을 바로 작성하여 기준없이 pattern 만으로 사용 가능
        String pattern = "60#D|70#C|80<B|90#A";
        // #인 경우 해당 값까지의 표현이지만 < 의 경우 해당 값은 제외이다
        int[] scores = {99, 23, 48, 76, 66, 82, 100, 70, 80};

        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);

        for (int score : scores) {
            System.out.println(score + " : " + choiceFormat.format(score));
        }
    }
}
