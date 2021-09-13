package Chapter6.ch6.constructor;

public class Product {
    static int count = 0;
    int serialNo;

    /*
     인스턴스 블럭 -> 인스턴스화 시 값이 초기화되는 블럭
     클래스 변수인 count를 참조하여 product가 여러 곳에서 인스턴스화 되어 사용되더라고 serialNo가 중복되지 않고 초기화된다
     */ {
        ++count;
        serialNo = count;
    }

    // 기본 생성자
    Product() {
    }
}
