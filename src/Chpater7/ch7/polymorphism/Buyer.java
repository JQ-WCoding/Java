package Chpater7.ch7.polymorphism;


// Buyer 클래스 -> 소비자를 표현
public class Buyer {
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
