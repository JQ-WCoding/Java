package Chapter2.ch2.CharEx;

public class CharToCode {
    public static void main(String[] args) {
        // char형 변수 alphabet에 A 초기화
        char alphabet = 'A';
        // 해당 값인 A를 int형으로 형변환
        int toNum = (int) alphabet;
        // 순서에 맞게 변수를 출력하기 위한 지시어 사용
        System.out.printf("%c = %d(%#X) %n", alphabet, toNum, toNum);

        // char형 hanguel 변수에 '가' 입력
        char hanguel = '가';
        // 순서대로 출력하면서 즉시 형변환 작업
        System.out.printf("%c = %d(%#X)%n", hanguel, (int) hanguel, (int) hanguel);
    }
}
