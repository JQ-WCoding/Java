package chapter11.collections;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person temp = (Person) o;
            return name.equals(temp.name) && age == temp.age;
        }
        return false;
    }

    // 해쉬코드 출력
    public int hashCode() {
        return (name + age).hashCode();
    }
}
