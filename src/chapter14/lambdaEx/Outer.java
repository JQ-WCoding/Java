package chapter14.lambdaEx;

public class Outer {
    int value = 10;

    class Inner {
        int value = 20;

        void method( int i ) {
            int value = 30;

            // 선언과 동시에 구현 -> myMethod() 구현
            MyFunction2 f = ( ) -> {
                System.out.println( "i : " + i );
                // method 의 지역변수 value 값 출력
                System.out.println( "value : " + value );
                // Inner 클래스의 field 값 value 출력
                System.out.println( "this.value : " + ++this.value );
                // Outer 클래스의 this.value 값 출력
                System.out.println( "Outer.this.value : " + ++Outer.this.value );
            };
            // 상단의 구현된 내용 출력
            f.myMethod();
        }
    }
}
