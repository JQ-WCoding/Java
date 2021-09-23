package chapter9.objects;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {
    public static void main(String[] args) {
        String data = "1,kim,1,1,1|2,park,3,4,5|3,lee,6,7,8";
        StringTokenizer stringTokenizer = new StringTokenizer(data, "|");

        // StringTokenizer 의 추가사항 여부에 따른 반복문
        while (stringTokenizer.hasMoreTokens()) {
            // token 의 값을 문자열로 반환하여 저장한다
            String token = stringTokenizer.nextToken();
            // 해당 당일 토큰에 대해 "," 구분자를 이용하여 다시 나눈다
            StringTokenizer stringTokenizer2 = new StringTokenizer(token, ",");

            // 두번째 구분된 토큰의 값이 존재하는 경우
            while (stringTokenizer2.hasMoreTokens()) {
                // 토큰이 없을 경우까지 계속 출력
                System.out.println(stringTokenizer2.nextToken());
            }

            System.out.println("---------------");
        } // while
    }
}
