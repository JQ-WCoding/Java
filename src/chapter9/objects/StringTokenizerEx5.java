package chapter9.objects;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "1,,,2,,3";
        // 문자열 배열을 이용한 것과 StringTokenizer 의 차이 알기
        // 문자열 배열 split() 사용하여 나누기
        String[] result = data.split(",");
        // 구분자 사용한 토큰
        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");

        System.out.println("split() : ");
        // result 문자열 배열 출력
        for (String str : result) {
            System.out.print(str + "|");
        }
        System.out.println("count : " + result.length);

        System.out.println();

        System.out.println("StringTokenizer : ");
        // i를 반복문 외부에 선언하여 반복문 종료 후에도 사용하기 for() 문의 첫 선언부분을 작성하지 않아도 됨
        int i = 0;
        // 토큰이 있는 경우 계속 반복하면서 i가 1씩 증가
        for (; stringTokenizer.hasMoreTokens(); i++) {
            System.out.print(stringTokenizer.nextToken() + "|");
        }
        System.out.println("count : " + i);

        /*
        두 구분자의 차이는 spilt()의 경우 : ','를 구분자로 공백도 각각 나누어 저장한다
        하지만 StringTokenizer 는 ','를 구분자로 공백은 포함시키지 않고 값이 있는 경우에만 저장한다
         */
    }
}
