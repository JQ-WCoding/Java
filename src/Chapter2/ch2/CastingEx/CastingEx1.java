package Chapter2.ch2.CastingEx;

public class CastingEx1 {
    public static void main(String[] args) {
        /*
        double의 int형으로 형변환
        동시에 반올림 처리 되는지 궁금하여 실험해봄
        결과 -> 그런거 없음
         */
        double d1 = 12.1;
        double d2 = 12.8;

        int score1 = (int) d1; // 12? -> 12
        int score2 = (int) d2; // 13? -> 12

        System.out.println("score1 = " + score1);
        System.out.println("score2 = " + score2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        /*
        새로 생각난 점
        -> 기본형과 참조형간의 형변환은 불가능
        -> String 문자열을 int형으로 바꾸려면 Integer.parsrInt() 를 사용하던 이유... 왜 생각 못했징
        -> 기본형 간에는 단순 float f = "123f"; - > int number = (int) f; 으로 가능했던 것
         */
    }
}
