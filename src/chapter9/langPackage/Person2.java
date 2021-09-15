package chapter9.langPackage;

public class Person2 {
    long id;
    int gender;

    // 기본생성자
    Person2() {
        this(12345L, 1);
    }

    // 생성자
    Person2(long id, int gender) {
        this.id = id;
        this.gender = gender;
    }

    // toString() 오버라이드 -> 주소가 아닌 값을 표시할 수 있도록 변경한다
    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", gender=" + gender +
                '}';
    }
}
