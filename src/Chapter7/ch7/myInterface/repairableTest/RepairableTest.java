package Chapter7.ch7.myInterface.repairableTest;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();
        Marine marine = new Marine();
        SCV scv = new SCV();

        // SCV 의 repair() 메소드를 이용
        // tank 와 dropShip 은 repairable 을 상속받고 있어 해당 메소드의 인자값으로 넘겨줄 수 있었다.
        scv.repair(tank);
        scv.repair(dropShip);
//        scv.repair(marine); // marine 은 repairable 을 상속받지 않고 있다
    }
}
