package chapter12.enumEx;

// 추상 클래스인 MyEnum 의 <> 제네릭스 선언으로 MyEnum<T>를 상속받는 형으로 선언 가능하다는 의미
public abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
    static int id = 0;
    int ordinal;
    String name;

    public int getOrdinal() {
        return ordinal;
    }

    MyEnum(String name) {
        this.name = name;
        ordinal = id++;
    }

    // Override 한 메소드 Comparable 에 선언되어 있음
    public int compareTo(T t) {
        return ordinal - t.getOrdinal();
    }
}
