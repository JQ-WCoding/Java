package Chapter4.ch4.FlowEx;

public class FlowEx19 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    // 앞에 ""을 붙인 이유는 현재 값을 String 문자열로 변경해서 쉽게 숫자를 증가시킬 수 있다.
                    System.out.println("" + i + j + k);
                }
            }
        }
    }
}
