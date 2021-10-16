package chapter14.lambdaEx;

public class LambdaEx1 {
    public static void main(String[] args) {
        // MyFunction 은 함수형 인터페이스이기 때문에 하나의 추상 메소드만 선언되어 있다
        // f1 f2 f3 -> 각각 다른 방법으로 MyFunction 생성하기
        MyFunction f1 = () -> System.out.println( "f1.run()" );

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println( "f2.run()" );
            }
        };

        MyFunction f3 = getMyFunction();

        // 각 특성별로 선언한 객체의 run()메소드 실행하기
        f1.run();
        f2.run();
        f3.run();

        execute( f1 );
        // run()메소드가 System.out.println( "run()" )인 MyFunction 인터페이스를 인자값으로 보내준다
        execute( () -> System.out.println( "run()" ) );
    }

    static void execute(MyFunction f) {
        // 인자값으로 받은 f 의 run()메소드 실행
        f.run();
    }

    static MyFunction getMyFunction() {
        return () -> System.out.println( "f3.run()" );
    }
}
