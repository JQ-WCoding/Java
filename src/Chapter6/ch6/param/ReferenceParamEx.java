package Chapter6.ch6.param;

public class ReferenceParamEx {
    public static void main(String[] args) {
        // Data 클래스 인스턴스화 작업
        Data data = new Data();
        data.x = 10;
        // 참조변수 data의 x 값을 10으로 초기화한 결과를 출력
        System.out.println("main() -> x : " + data.x);

        // change() 진입 -> 인자값으로 data 객체를 준다
        change(data);

        // change() 종료 후 변경유무를 확인하기 위한 출력문
        System.out.println("After");
        System.out.println("main() -> x : " + data.x);
    }

    static void change(Data data){
        /*
         data 객체(인스턴스)를 매개변수로 받아 해당 객체의 x값을 1000으로 초기화한다.
         -> 해당 값은 data 객체의 x이다. x값의 주소에 해당되는 영역의 값을 변경하기 때문에 data.x의 값은 변경이 없는 한 계속 1000으로 유지
         */
        data.x = 1000;
        // 출력문
        System.out.println("change() -> x : " + data.x);
    }
}
