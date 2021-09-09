package Chapter6.ch6.param;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest returnTest = new ReturnTest();

        int result = returnTest.add(3, 5);
        System.out.println(result); // 8

//        int[] result2 = {0};
        // 배열 선언 후 정수형 배열은 0으로 기본값 초기화 상태임으로 둘다 상관없음
        int[] result2 = new int[1];

        returnTest.add(7, 4, result2);
        // 7 + 4 인 11의 값을 result2[0]에 초기화하는 과정 후 출력
        System.out.println(result2[0]); // 11
    }

    /**
     * 더하기
     *
     * @param a
     * @param b
     * @return a + b
     */
    int add(int a, int b) {
        // static을 사용하지 않은 이유 -> ReturnTest 클래스를 인스턴스화 하여 사용하기 때문에 전역으로 선언할 필요없이 참조가능
        return a + b;
    }

    /**
     * 더하기
     *
     * @param a
     * @param b
     * @param result
     */
    void add(int a, int b, int[] result) {
        // 매개변수 int형 배열 추가 -> 매개변수 result[0] 첫번째 방에 a + b의 값으로 초기화
        result[0] = a + b;
    }
}
