package Chapter6.ch6.constructor;

public class StaticBlockTest {
    // 클래스 변수 -> int형 배열 arr 선언
    static int[] arr = new int[10];

    // 클래스 블럭
    static {
        // 임의의 값 초기화 과정
        for (int i = 0; i < arr.length; i++) {
            // 1 ~ 10 임의의 값을 arr 배열에 순차적으로 초기화
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        /*
         클래스 변수이기 때문에 추가 선언 없이 사용가능
         모든 값이 0으로 나오지 않고 다양한 숫자가 나오는 이유 : static을 통해 main() 실행 전 클래스 블럭을 통해 초기화 이후 해당 반복문을 실행하기 때문에
         */
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
