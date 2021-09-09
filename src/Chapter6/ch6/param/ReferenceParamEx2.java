package Chapter6.ch6.param;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        // 방이 한개만 설정된 x 배열에 정수 5를 초기화
        int[] x = {5};
        // 해당 x배열의 0번째 값 출력
        System.out.println("main() -> x : " + x[0]);

        // change() 실행
        change(x);

        // change() 이후 main()에서 출력
        System.out.println("After");
        System.out.println("main() -> x : " + x[0]);
    }

    static void change(int[] x) {
        /*
         배열은 전에 배웠던것 처럼 주소값을 가지고 있다 -> Arrays.toString() 과 같은 메소드를 사용했던 이유
         따라서, 배열 x의 0번째 값을 333으로 바꾸는 경우는 참조변수인 배열 x가 참조하는 주소에 들어있는 값을 변경하는 것이기 때문에 이후 값도 3333으로 유지될것
         */
        x[0] = 3333;
        // 내부 출력
        System.out.println("change() -> x : " + x[0]);
    }
}
