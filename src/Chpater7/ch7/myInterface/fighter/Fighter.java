package Chpater7.ch7.myInterface.fighter;

public class Fighter extends Unit implements Fightable {
    /*
     오버라이딩 시 부모의 메소드 범위보다 넓은 접근 제어자를 지정해주어야한다.
     -> Movable 의 move() 메소드 접근제어자가 public 이기 때문에
     -> public 보다 보다 좁은 범위인 private, protected 는 사용할 수 없다.
     따라서, public 을 꼭 붙여주어 접근제어자가 동일하거나 넓은 것을 표시해주어야 한다.
     */
    @Override
    public void move(int x, int y) {
        // 구현 가정
    }

    @Override
    public void attack(Unit unit) {

    }
}
