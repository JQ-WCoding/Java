package chapter9.langPackage;

public class PersonToString2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        Person2 person2 = new Person2(12333L, 2);

        // 값으로 출력하기
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
