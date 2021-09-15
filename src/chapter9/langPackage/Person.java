package chapter9.langPackage;

public class Person {
    long id;
    int gender;

    // 기본생성자
    Person() {
        this(12345L, 1);
    }

    // 생성자
    Person(long id, int gender) {
        this.id = id;
        this.gender = gender;
    }
}
