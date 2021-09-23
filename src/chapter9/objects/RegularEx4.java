package chapter9.objects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx4 {
    public static void main(String[] args) {
        String data = "It's time to try defying gravity, " +
                "I think I'll try defying gravity";

        String pattern = "gravity";
        StringBuffer stringBuffer = new StringBuffer();

        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(data);
        // 기존 문자열 출력
        System.out.println("Data: " + data);

        int i = 0;
        // false 가 반환되면 종료(찾는 동안 계속 반복)
        while (matcher.find()) {
            // 해당 매칭에 대해 몇번째 인덱스부터 몇번째인지 출력하는 문구
            System.out.println(++i + " match : " + matcher.start() + " ~ " + matcher.end());
            //appendReplacement()가 매개변수로 StringBuffer 형을 받기때문에 -> StringBuilder 를 인자값으로 주면 오류가 발생
            // stringBuffer 에 변경된 값인 문자열로 대체하여 저장한다
            matcher.appendReplacement(stringBuffer, "pattern");
        }

        // 마지막(끝부분)으로 값이 변경된 부분을 stringBuffer 에 추가 -> 검색 이후 치환하면 return 으로 인하여 종료되어 뒷 문자들이 저장되지 않는다
        // 따라서, 추가로 뒷부분을 저장하기 위해선 appendTail()을 통해 저장해주어야 한다
        matcher.appendTail(stringBuffer);
        System.out.println("Replacement Count : " + i);
        // 변경 후의 문자열 출력
        System.out.println("result : " + stringBuffer.toString());
    }
}
