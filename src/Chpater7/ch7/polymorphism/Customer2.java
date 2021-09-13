package Chpater7.ch7.polymorphism;

import java.util.Vector;

public class Customer2 {
    int money = 10_000;
    int bonusPoint = 0;
    /*
     Vector 를 사용하여 배열 수정 용이하게 변경
     Vector에 <> 를 통해 어떠한 클래스를 사용할지 미리 작성해두었다
     */
    Vector<Automobile2> automobiles = new Vector<Automobile2>();

    /**
     * 차량 구매
     *
     * @param automobile
     */
    void buy(Automobile2 automobile) {
        // 만약 돈이 차량 가격보다 없다면 조거문
        if (money < automobile.price) {
            System.out.println("Not enough money");
            // 더 이상 실행하지 않고 즉시 반환
            return;
        }

        money -= automobile.price;
        bonusPoint += automobile.bonusPoint;
        // Vector의 참조변수 automobiles에 Automobile2 참조변수를 매개변수로 받아 배열에 입력한다 .add() 메소드를 통해 입력
        automobiles.add(automobile);
        // 추가될때마다 1씩 증가 -> static으로 하면 모든 구매자가 공유하게 됨으로 각 객체마다 최대 구매 갯수를 제한하기 위해 static 없음
        System.out.println("Successfully bought " + automobile);
    }

    /**
     * 환불
     *
     * @param automobile
     */
    void refund(Automobile2 automobile) {
        /*
         automobiles 배열에서 매개변수로 받은 automobile의 값을 제거하는 remove() 메소드 사용
         -> true 이면, 이기에 해당 값이 정상적으로 메소드를 통해 지워졌다면 조건문이 실행
         */
        if (automobiles.remove(automobile)) {
            money += automobile.price;
            bonusPoint -= automobile.bonusPoint;
            System.out.println("Successfully refund " + automobile);
        }
        // 제대로 실행되지 않은 경우 하단의 출력문 출력
        else {
            System.out.println("No match");
        }
    }

    /**
     * 요약
     */
    void summary() {
        // 구매 물품 총 합계를 위해 (지역변수)
        int sum = 0;
        StringBuilder automobileList = new StringBuilder(); // 문자열 선언

        if (automobiles.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        for (int i = 0; i < automobiles.size(); i++) {
            // Array에서 [] 와 같은 문구를 통해 해당 인덱스의 값을 불러오는것 처럼 get()메소드를 사용하여 값을 호출한다
            Automobile2 automobile = (Automobile2) automobiles.get(i);
            sum += automobile.price;
            // 삼항연산 -> i가 첫번째 일때는 문자열로 반환한 값을 추가하지만 이후 순번(인덱스) 부터는 ,를 값 앞에 붙여 시각적으로 정리 해준다
            automobileList.append((i == 0) ? ("" + automobile) : (", " + automobile));
        }
        // 반복문 완료 후
        System.out.println("sum : " + sum);
        // 구매 차량 전체 문자열로 표현
        System.out.println("all : " + automobileList.toString());
    }
}
