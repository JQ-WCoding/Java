package chapter9.objects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {
    public static void main(String[] args) {
        // 패턴을 검사할 데이터
        String[] data = {"bus", "butter", "boss", "bonus", "CAR", "co", "ba", "buNDLE", "count", "date", "desk", "c.", "bu091", "b9"};

        // 검사할 패턴들
        String[] patterns = {".*", "bu[a-z]*", "b[a-z]*", "b[a-zA-Z]*", "b[a-zA-Z0-9]", "c.", "c\\.", "c.*", "[b|c].*", ".*a.*", "[b|c].{2}"};

        // pattern 들을 확인해서 matcher 를 통해 일치하는 경우 matches()에서 반환받은 true 혹은 false 를 확인하고 -> 해당 값을 출력한다
        for (String pat : patterns) {
            Pattern pattern = Pattern.compile(pat);
            System.out.print("Pattern : " + pat + " / Match ? ");
            for (String str : data) {
                Matcher matcher = pattern.matcher(str);
                if (matcher.matches()) {
                    System.out.print(str + ", ");
                }
            }
            System.out.println();
        }
    }
}
