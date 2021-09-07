package Chapter2.ch2.VarEx;

public class VarEx2 {
    public static void main(String[] args) {
        // 정수형 변수 a와 b에 각각 1, 2로 초기화 (같은 형태의 선언이라면 1 열에 묶어서 선언 가능) temp도 추가해보았다
        int a = 1, b = 2, temp = 0; // temp는 '임의'로 사용할 변수지만 0으로 초기화하여 사용하기로 함
        
        // a: () ,b: () ,temp: () 각각 변수와 문자열을 +를 이용하여 붙여 출력
        System.out.println("a: " + a + ",b: " + b + ",temp: " + temp); // 예상값 : 1, 2, 0
        
        // 변수명 temp에 a의 값으로 초기화 (같은 형태의 변수여야한다. int -> int / double -> double 등) -> 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 가능
        temp = a;
        // 변수명 a에 b의 값으로 초기화
        a = b;
        // 변수명 b에 temp의 값으로 초기화 -> 즉 a의 값으로 변경된 temp의 값이 b에 초기화
        b = temp;

        System.out.println("a: " + a + ",b: " + b + ",temp: " + temp); // 예상값 : 2, 1, 1

        /*
        예약어를 변수명으로 사용하지 말자 -> static, boolean, while, try 등
        1. 클래스 이름의 첫 글자는 항상 대문자
        2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자
        3. 상수의 이름은 모두 대문자, 여러 단어로 이루어진 경우 '_'로 구분
         */
        int octNum = 010; // 8진수 10
        System.out.println(octNum); // 10진수로 변경되어 8을 표현
    }
}
