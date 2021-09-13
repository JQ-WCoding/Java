package Chapter6.ch6.constructor;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        Data2 data2 = new Data2(1);
        // 기본생성자를 추가 정의 한 후 Data2 인스턴스화 할 경우 (생성자에 인자값을 추가하지 않았다)
        Data2 data22 = new Data2();
    }
}
