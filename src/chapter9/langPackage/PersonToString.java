package chapter9.langPackage;

public class PersonToString {
    public static void main(String[] args) {
        // 예제 클래스 명을 바꾸다 보니 CardToString 예제이지만 PersonToString 으로 변경... :(
        Person person1 = new Person();
        Person person2 = new Person();

        // 오버라이딩 하지 않은 toString 은 16진수의 해시코드값을 반환
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
