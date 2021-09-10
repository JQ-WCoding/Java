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

class Product {
    int price, bonusPoint;

    // 생성자를 통해 초기화
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

}

// Product 상속받고 있는 Tv
class Tv extends Product {
    // 부모클래스 생성자에 인자값 1 부여
    Tv() {
        super(1);
    }

    // toString() 오버라이딩 하여 간단한 문자열만 반환
    @Override
    public String toString() {
        return "Tv";
    }
}

// Product 상속받고 있는 Computer
class Computer extends Product {
    // 부모클래스 생성자에 인자값 2 부여
    Computer() {
        super(2);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

// Buyer 클래스 -> 소비자를 표현
class Buyer {
    // 인스턴스 변수 money, bonusPoint -> 선언과 초기화를 동시에 시작
    int money = 10;
    int bonusPoint = 0;

    /**
     * 구매하기
     *
     * @param product
     */
    void buy(Product product) {
        // buyer 클래스를 가진 money 보다 product.price 적으면 -> 살 수 없다면
        if (money < product.price) {
            System.out.println("Not enough money");
            // 즉신 반환하여 메소드 종료
            return;
        }

        // 돈은 상품 가격을 뺀 나머지
        money -= product.price;
        // 보너스 포인트는 해당 계산값을 적용하여 보너스 포인트 초기화
        bonusPoint += product.bonusPoint;
        // 출력문
        System.out.println("successfully bought " + product);
    }
}