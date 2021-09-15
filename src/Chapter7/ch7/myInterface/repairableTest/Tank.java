package Chapter7.ch7.myInterface.repairableTest;

public class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150); // 직접 입력
        hitPoint = MAX_HP; // hitPoint 는 MAX_HP가 가능? Unit 의 final 변수
    }

    @Override
    public String toString() {
        return "Tank";
    }
}
