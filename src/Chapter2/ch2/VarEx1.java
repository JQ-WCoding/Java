package Chapter2.ch2;

public class VarEx1 {
    public static void main(String[] args) {
        // birthYear(생년)이라는 int형 변수를 선언하고 값을 1994로 초기화하는 과정을 동시에 진행
        int birthYear = 1994;
        // age(나이)라는 int형 변수를 선언하고 값을 28로 초기화
        int age = 28;

        // System 객체의 println 메소드를 이용하여 console에 각 변수의 값을 출력한다.(주소를 출력하지 않고 값을 출력)
        System.out.println(birthYear); // 예상값 : 1994
        System.out.println(age); // 예상값 : 28

        // 이미 선언된 birthYear라는 변수에 age변수의 값과 정수 2020을 더한 값으로 초기화 (새로운 값이 적용된다.)
        birthYear = age + 2020;
        // 이미 선언된 age라는 변수에 1을 더한 값을 초기화
        age += 1;

        // 새로운 값으로 초기화된 변수 birthYear와 age을 출력
        System.out.println(birthYear); // 예상값 : 2048
        System.out.println(age); // 예상값 : 29
    }
}
