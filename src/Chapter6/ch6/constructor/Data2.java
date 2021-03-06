package Chapter6.ch6.constructor;

public class Data2 {
    int value;

    /*
     매개변수를 통해 인스턴스 변수의 값을 생성과 동시에 초기화 하는 생성자 정의
     생성자가 사용자에 의해 새롭게 정의되어 있다면 해당 요건에 맞게 생성해야한다(매개변수 필요 등) -> 그렇지 않은 경우, 컴파일 에러가 발생
     기본생성자도 추가적으로 정의한다면 -> 오버로딩처럼 다양하게 사용가능하다
     */
    Data2(int a) {
        value = a;
    }

    Data2() {
    }
}
