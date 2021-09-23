package chapter9.objects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bus", "butter", "boss", "bonus", "CAR", "co", "ba", "bundle", "count", "date", "desk", "c."};

        // 정규식 패턴 선언
        Pattern pattern = Pattern.compile("bu[a-z]*");

        // 반복문내 matcher() 를 통해 pattern 과 data 의 값이 일치하는지 확인하고 matches()통해 일치함(true)을 반환 받았다면, 해당 값을 출력한다
        for (String str : data) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.print(str + ", ");
            }
        }
    }
}
