package Chpater7.ch7.polymorphism;

import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        // 소비자 인스턴스화
        Customer2 customer = new Customer2();
        // 3 가지 종류의 상품 모두 인스턴스화
        // 여러 상품 구매를 위해 가격 낮춤
        Benz2 benz = new Benz2();
        Audi2 audi = new Audi2();
        BMW2 bmw = new BMW2();

        // 각각의 상품 한번씩 구매
        customer.buy(benz);
        customer.buy(audi);
        customer.buy(bmw);
        // 추가사항 -> 5 6개를 사도 출력이 되는지 확인하기
        customer.buy(audi);
        customer.buy(audi);
        customer.buy(audi);
        // 2개 더 추가하면 초과 금액
        customer.buy(audi);
        customer.buy(audi);
        // 초과시 출력문 출력
        // 구매가 잘 이루어졌는지 확인을 위한 메소드 실행
        customer.summary();
        System.out.println();

        customer.refund(benz);
        customer.summary();
    }
}





