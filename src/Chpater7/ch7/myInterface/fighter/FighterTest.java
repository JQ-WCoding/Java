package Chpater7.ch7.myInterface.fighter;

import Chpater7.ch7.myInterface.parserTest.Movable;
import Chpater7.ch7.myInterface.parserTest.Unit;

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        
        /*
         Fighter 클래스의 각각 비교 클래스, 인터페이스의 상속여부를 instanceof 를 이용해 확인
         해당 결과가 맞는 경우 -> if 문 내의 출력문을 출력
         */
        if (fighter instanceof Unit) {
            // 클래스의 상속 여부이기 때문에
            System.out.println("자식 : fighter / 부모 : Unit");
        }

        // Fightabl 인터페이스는 Movable과 Attackable을 모두 상속받은 인터페이스 이다
        if (fighter instanceof Fightable) {
            System.out.println("fighter는 Fightable 인터페이스를 구현");
        }

        // 따라서, Movable과 Attackable은 Fighter 클래스가 Fightable을 상속받고 있기에 둘다 상속받은 것으로 적용된다
        if (fighter instanceof Movable) {
            System.out.println("fighter는 Movable 인터페이스를 구현");
        }

        if (fighter instanceof Attackable) {
            System.out.println("fighter는 Attackable 인터페이스를 구현");
        }

        // 모든 클래스의 부모인 Object는 fighter 클래스에게도 부모 클래스이다.
        if (fighter instanceof Object) {
            System.out.println("자식 : fighter / 부모 : Object");
        }
    }
}
