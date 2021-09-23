package chapter9.objects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
    public static void main(String[] args) {
        String phoneNum = "HP:010-1234-5678, HOME:02-123-4567";
        // 0 이후 숫자 1개 ~ 2개 - 숫자 3개 ~ 4개 - 숫자 4개
        String patterns = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";

        // 패턴 설정 및 매칭
        Pattern pattern = Pattern.compile(patterns);
        Matcher matcher = pattern.matcher(phoneNum);

        int i = 0;
        // matcher.find()가 false 가 되는 순간까지
        while (matcher.find()) {
            System.out.print(++i + " : " + matcher.group() + " -> ");
            // 반복문으로 변경해봄 -> matcher 의 groupCount 를 이용해 해당 인덱스 값을 찾은 후 -> group() 인자값으로 인덱스를 보내 나눈 값들을 출력
            for (int j = 1; j < matcher.groupCount() + 1; j++) {
                System.out.print(matcher.group(j) + ", ");
            }
            System.out.println();
        }
    }
}
