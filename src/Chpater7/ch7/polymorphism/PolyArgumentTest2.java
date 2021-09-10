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


class Automobile {
    int price, bonusPoint;

    Automobile(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    // 기본 생성자
    Automobile() {

    }
}

class Benz extends Automobile {
    Benz() {
        super(6000);
    }

    @Override
    public String toString() {
        return "Benz";
    }
}

class BMW extends Automobile {
    BMW() {
        super(1000);
    }

    @Override
    public String toString() {
        return "BMW";
    }
}

class Audi extends Automobile {
    Audi() {
        super(4000);
    }

    @Override
    public String toString() {
        return "Audi";
    }
}

class Customer {
    int money = 10_000;
    int bonusPoint = 0;
    // 3개까지만 가질 수 있도록 설정
    Automobile[] automobiles = new Automobile[3];
    int x = 0;

    /**
     * 차량 구매
     *
     * @param automobile
     */
    void buy(Automobile automobile) {
        if (money < automobile.price) {
            System.out.println("Not enough money");
            return;
        }

        money -= automobile.price;
        bonusPoint += automobile.bonusPoint;
        // 추가될때마다 1씩 증가 -> static으로 하면 모든 구매자가 공유하게 됨으로 각 객체마다 최대 구매 갯수를 제한하기 위해 static 없음
        automobiles[x++] = automobile;
        System.out.println("Successfully bought " + automobile);
    }

    void summary() {
        // 구매 물품 총 합계를 위해 (지역변수)
        int sum = 0;
        StringBuilder automobileList = new StringBuilder(); // 문자열 선언

        for (int i = 0; i < automobiles.length; i++) {
            // 구매한 차량이 없을 경우
            if (automobiles[i] == null) {
                break;
            }

            // 구매한 모든 차량의 가격을 합산하는 과정
            sum += automobiles[i].price;
            automobileList.append(automobiles[i]).append(" ");
        }
        // 반복문 완료 후
        System.out.println("sum : " + sum);
        // 구매 차량 전체 문자열로 표현
        System.out.println("all : " + automobileList.toString());
    }
}