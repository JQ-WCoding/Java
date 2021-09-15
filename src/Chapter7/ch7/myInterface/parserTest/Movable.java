package Chapter7.ch7.myInterface.parserTest;

public interface Movable {
    // public abstract 생략되어 있음 -> void 와 같은 표기로 시작되면 default 는 public 이 접근제어자이다
    void move(int x, int y);
}
