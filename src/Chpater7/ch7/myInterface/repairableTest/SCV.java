package Chpater7.ch7.myInterface.repairableTest;

public class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(100);
        hitPoint = MAX_HP;
    }

    void repair(Repairable repairable) {
        // repairable 하지만 Unit 을 부모로 가지고 있는가 ? -> 유닛만 고치기 가능
        if (repairable instanceof Unit) {
            Unit unit = (Unit) repairable; // Unit 이 부모인지 확인했기에 형변환(Unit)을 가능하게 한다
            while (unit.hitPoint != unit.MAX_HP) { // 두 값이 같아지면 반복문 종료 -> 현재 생명력 같은거
                unit.hitPoint++;
            }
            System.out.println("Repair!");
        }
    }
}
