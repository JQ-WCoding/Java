package Chapter5.ch5.ArrayEx;

public class ArrayEx14 {
    public static void main(String[] args) {
        String str = "ABCDE";

        // 각 자리별 문자 출력
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
        }

        // String을 char 배열로 변환
        char[] chArr = str.toCharArray();

        // char 배열 출력
        System.out.println(chArr);
    }
}
