package Chapter7.ch7.myInterface.interfaceTest2;

public class InterfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        // B 와 C는 각각 Interface 를 상속받고 있기 때문에 autoPlay() 의 인자값으로 제공한다
        // 상속받은것 중 가장 인접한 메소드를 호출하기 때문에 각각 B와 C의 play 를 출력한다
        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}
