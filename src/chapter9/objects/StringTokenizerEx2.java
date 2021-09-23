package chapter9.objects;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String str = "a=1*(2+3)/2";
        /*
         str 문자열을 = + - * / ( ) 의 구분한다
         마지막 true, false 는 해당 구분자를 반환할 것인가에 대한 내용
         true -> 구분자도 반환하여 값으로 초기화
         false -> 구분자는 반환하지 않고 나머지 값들만 초기화
         delim 인자값으로 사용한 " "내의 모든 부호는 전부 구분자로 사용
         */
        StringTokenizer stringTokenizer = new StringTokenizer(str, "=+-*/()", true);

        // stringTokenizer 가 값이 있는한 계속 출력
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
