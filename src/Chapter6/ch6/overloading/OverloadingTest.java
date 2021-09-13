package Chapter6.ch6.overloading;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        // 4개의 메소드 모두 형태가 다른 인자값을 주었지만 메소드 명은 똑같다
        System.out.println("add(4, 4) result : " + myMath.add(4, 4));
        System.out.println("add(4L, 4) result : " + myMath.add(4L, 4));
        System.out.println("add(4, 4L) result : " + myMath.add(4, 4L));
        System.out.println("add(4L, 4L) result : " + myMath.add(4L, 4L));

        // arr 배열 초기하
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("add(arr) result : " + myMath.add(arr));

        /*
         모두 같은 클래스의 동일한 명칭의 메소드이지만 다른 인자값을 대입하였고, 오류 없이 결과를 반환하였다 -> 오버로딩의 이유
         -> 같은 행동을 한다면 이름을 낭비하지 않기위해 오버로딩하여 반환 타입이나 매개변수의 타입 혹은 갯수에 변화를 준다
         */
    }
}

