package Chapter6.ch6.constructor;

public class ProductTest {
    public static void main(String[] args) {
        // 인스턴스 product1이 생성되면서 인스턴스 블록이 실행된다 -> ++count 이후, serialNo에 해당 값 초기화 / 0 -> 1
        Product product1 = new Product();
        // 인스턴스 product2도 똑같은 작업이 실행된다 -> 클래스 변수인 count는 1증가한 값 1임으로 ++1 -> 2가 되어 초기화 된다
        Product product2 = new Product();
        // 인스턴스 product3도 똑같은 작업을 실행
        Product product3 = new Product();

        // 코드블럭들이 완료되고 serialNo가 값에 맞게 초기화 되었는지 확인 출력
        System.out.println(product1.serialNo);
        System.out.println(product2.serialNo);
        System.out.println(product3.serialNo);

        // count가 클래스의 인스턴스화를 3번 거치는 동안 3증가 하였는지 확인하는 출력문
        System.out.println("count = " + Product.count);
    }
}
