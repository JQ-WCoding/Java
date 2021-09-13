package Chpater7.ch7.polymorphism;

public class PolyArgumentTest {
    public static void main(String[] args) {
        // 참조변수 buyer 인스턴스화
        Buyer buyer = new Buyer();

        // buyer 메소드에 new Tv() 와 new Computer () 인스턴스화 하는 객체를 인자값으로 부여
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        // buy 메소드는 Product 를 매개변수로 가지고 있다 -> Tv와 Computer 는 해당 Product를 상속받은 객체이기 때문에
        // buy 메소드의 인자값으로 전달이 가능하다

        // 출력문
        System.out.println(buyer.money + " left");
        System.out.println(buyer.bonusPoint + " earn");
    }
}
