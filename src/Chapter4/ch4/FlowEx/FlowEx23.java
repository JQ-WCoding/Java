package Chapter4.ch4.FlowEx;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 3;
        // 대입을 확인하고 1씩 줄어든다 -> 3 != 0 (i는 2가 되고 값이 출력), 2 != 0 (i는 1이 되고 값이 출력), 1 != (i는 0이 되고 갑싱 출력)
        while (i-- != 0) {
            System.out.println(i); // 2, 1, 0
        }
        System.out.println("------------------");

        for (int j = 3; j > 0; j--) {
            System.out.println(j);
        }

        System.out.println("-------------------");

        i = 3;
        // 먼저 감소를 적용한 후 확인한다 -> 2 != 0 (i는 2가 되고 값이 출력) 1 != 0 (i는 1이 되고 값이 출력), 0 != 0 (false -> 반복문이 종료된다)
        while (--i != 0) {
            System.out.println(i); // 2, 1
        }
    }
}
