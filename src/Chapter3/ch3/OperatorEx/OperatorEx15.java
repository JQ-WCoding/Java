package Chapter3.ch3.OperatorEx;

public class OperatorEx15 {
    public static void main(String[] args) {
        char lowerChar = 'a';
        // 32의 차이로 대소문자 구분이 가능 -> 연산이 완료되면 char로 형변환하여 다시 알파벳으로 초기화
        char upperChar = (char) (lowerChar - 32);

        System.out.println(upperChar);
    }
}
