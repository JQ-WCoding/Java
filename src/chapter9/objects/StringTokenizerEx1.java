package chapter9.objects;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    // ? 애매모호...
    public static void main(String[] args) {
        String data = "1,2,3,4,5";
        // 구분자 ","를 이용해 stringTokenizer 에 저장
        // 문자열과 구분자를 생성자의 인자값으로 넘기면 해당 값을 구분하여 객체에 저장
        // private String str;
        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");

        // 토큰이 더 있다면 반복문 true 로 계속 실행
        while (stringTokenizer.hasMoreTokens()){
            // 해당 토큰을 출력
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
