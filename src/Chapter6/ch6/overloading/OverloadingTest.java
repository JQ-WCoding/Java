package Chapter6.ch6.overloading;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        // 4개의 메소드 모두 형태가 다른 인자값을 주었지만 메소드 명은 똑같다
        System.out.println("add(4, 4) result : " + myMath.add(4, 4));
        System.out.println("add(4L, 4) result : " + myMath.add(4L, 4));
        System.out.println("add(4, 4L) result : " + myMath.add(4, 4L));
        System.out.println("add(4L, 4:) result : " + myMath.add(4L, 4L));

        // arr 배열 초기하
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("add(arr) result : " + myMath.add(arr));

        /*
         모두 같은 클래스의 동일한 명칭의 메소드이지만 다른 인자값을 대입하였고, 오류 없이 결과를 반환하였다 -> 오버로딩의 이유
         -> 같은 행동을 한다면 이름을 낭비하지 않기위해 오버로딩하여 반환 타입이나 매개변수의 타입 혹은 갯수에 변화를 준다
         */
    }
}

class MyMath {
    // 상단의 4개 메소드는 매개변수에 변화만 준 '더하기'를 하는 메소드이다.(반환값과 매개변수만 차이가 있다)
    /**
     * 더하기
     *
     * @param a
     * @param b
     * @return int a + b
     */
    int add(int a, int b) {
        System.out.print("int add(int a, int b) : ");
        return a + b;
    }

    /**
     * 더하기 오버로딩1
     *
     * @param a
     * @param b
     * @return long a + b
     */
    long add(int a, long b) {
        System.out.print("long add(int a, long b) : ");
        return a + b;
    }

    /**
     * 더하기 오버로딩2
     *
     * @param a
     * @param b
     * @return long a + b
     */
    long add(long a, int b) {
        System.out.print("long add(long a, int b) : ");
        return a + b;
    }

    /**
     * 더하기 오버로딩3
     *
     * @param a
     * @param b
     * @return
     */
    long add(long a, long b) {
        System.out.print("long add(long a, long b) : ");
        return a + b;
    }

    /**
     * 배열 더하기 오버로딩
     *
     * @param arr
     * @return int result
     */
    // 매개변수 배열의 총합을 구하는 메소드
    int add(int[] arr) {
        System.out.print("int add(int[] arr) : ");
        // 결과값 0으로 초기화
        int result = 0;
        // 반복문을 통해 배열의 값을 모두 더한다
        for (int i : arr) {
            result += i;
        }
        // 결과값 반환
        return result;
    }
    // 추가
    // 매개변수의 갯수를 모르겠으면, int[] 형식의 배열 혹은 int... 식으로 표현가능
//    int add(int... num) {
//        int result = 0;
//        for (int i : num) {
//            result += i;
//        }
//        return result;
//    }
}