package Chapter6.ch6.overloading;

public class MyMath {
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
