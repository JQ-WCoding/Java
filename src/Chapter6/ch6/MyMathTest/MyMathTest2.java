package Chapter6.ch6.MyMathTest;

public class MyMathTest2 {
    public static void main(String[] args) {
        // MyMath2의 경우 인스턴스 변수가 존재하고 해당 변수를 하단에서 각각 100L과 200L로 초기화
        MyMath2 myMath2 = new MyMath2();
        myMath2.a = 100L;
        myMath2.b = 200L;
        // 사칙연산 과정 -> 해당 인스턴스 변수의 값을 초기화하였고 매개변수가 필요한 메소드가 아니기 때문에 인자값이 따로 필요하지 않다
        System.out.println(myMath2.add());
        System.out.println(myMath2.subtract());
        System.out.println(myMath2.multiply());
        System.out.println(myMath2.divide());

        /*
         상단의 출력 값과 하단의 출력값이 같아야한다
         하단의 경우 MyMath3 클래스는 static 메소드를 사용하여 인스턴스화 없이 사용가능하며, 메소드내 매개변수가 필요하게 선언되어 있음으로
         이에 맞게 인자값을 상단과 같이 입력하였다.
         상단과 하단은 선언된 변수의 위치와 매개변수의 유무만 차이가 있음으로 결과값은 같아야한다
         */
        System.out.println(MyMath3.add(100L, 200L));
        System.out.println(MyMath3.subtract(100L, 200L));
        System.out.println(MyMath3.multiply(100L, 200L));
        System.out.println(MyMath3.divide(100L, 200L));
    }
}

