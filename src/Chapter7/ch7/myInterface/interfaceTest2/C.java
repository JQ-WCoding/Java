package Chapter7.ch7.myInterface.interfaceTest2;

// 클래스 B와 C는 Interface I 를 상속받고 있음
public class C implements I{
    @Override
    public void play() {
        System.out.println("play C!");
    }
}
