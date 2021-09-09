package Chapter6.ch6.param;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        // Data 클래스를 인스턴스화한 참조변수 data의 정수형 x변수 값 10으로 초기화
        Data data = new Data();
        data.x = 10;
        // main의 x값 출력 -> 10으로 초기화 하였으니 10으로 출력 / 초기화하지 않았다면 0으로 출력
        System.out.println("main() -> x : " + data.x);

        //change()를 실행하여 값을 변경하려 한다
        change(data.x);
        // change() 종료 -> 스택 제거
        // 이후 값이 변경되었는지 출력문
        System.out.println("After");
        System.out.println("main() -> x : " + data.x);
        /*
        변경되지 않음 -> change() 실행하는 동안의 스택이 change()가 종료된 이후 없어진다
        change() 메소드의 지역변수(?)로 변경된 값을 main()에서 읽을 수 없기 때문에 data.x의 주소를 그대로 참조한다
         */

    }

    /**
     * 값 변경 메소드
     * @param a
     */
    static void change(int a) {
        // 내부에 진입 후 data.x를 인자값으로 받은 매개변수 a의 값이 1000으로 초기화
        a = 1000;
        // a는 1000임을 출력
        System.out.println("change() -> x : " + a);
    }
}

// Data 클래스에 정수형 x 선언
class Data {
    int x;
}
