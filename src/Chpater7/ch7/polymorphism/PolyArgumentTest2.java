package Chpater7.ch7.polymorphism;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy(new Benz());
//        customer.buy(new Audi());
//        customer.buy(new Benz());
        customer.buy(new BMW());
        customer.buy(new BMW());
        customer.buy(new BMW());
        /*
         -> 10000 을 소유하고 있는 Customer 클래스를 인스턴스화한 참조변수 customer 는 마지막 buy() 에서
         구매불가 안내를 받은 후, 구매한 모든차량을 문자열로 출력된다 -> 예상값 Benz, Audi
         
         추가 실험을 차량 가격을 내려 4개 이상 구매 되도록 설정 해봄
         -> 설정된 배열 공간이 3이라 추가 구매에선 오류발생
         */
        customer.summary();
        
        
    }
}










