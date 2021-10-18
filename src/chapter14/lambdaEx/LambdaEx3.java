package chapter14.lambdaEx;

public class LambdaEx3 {
    public static void main( String[] args ) {
        // Outer 클래스를 먼저 인스턴스화하고 이후 Inner 클래스를 선언해야한다
        Outer outer = new Outer();
        // Inner 클래스 선언 방법
        Outer.Inner inner = outer.new Inner();
        inner.method( 100 );
    }
}
