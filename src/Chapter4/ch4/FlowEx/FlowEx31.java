package Chapter4.ch4.FlowEx;

public class FlowEx31 {
    public static void main(String[] args) {
        // 0 ~ 10까지 확인
        for (int i = 0; i <= 10; i++) {
            // 홀수인 경우를 찾기 위해 2로 나누었을 때, 나머지가 0인경우 하단의 출력문을 실행하지 않고 최상단으로 조건으로 간다
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
