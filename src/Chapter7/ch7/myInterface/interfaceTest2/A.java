package Chapter7.ch7.myInterface.interfaceTest2;

public class A {
    // 매개변수로 Interface 인터페이스형 참조변수 i를 통해 play() 메소드를 호출
    void autoPlay(I i){
        i.play();
    }
}
