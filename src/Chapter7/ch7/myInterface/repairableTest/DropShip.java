package Chapter7.ch7.myInterface.repairableTest;

public class DropShip extends AirUnit implements Repairable {
    DropShip() {
        super(200);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "DropShip";
    }
}
