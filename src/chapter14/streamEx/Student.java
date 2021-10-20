package chapter14.streamEx;

public class Student implements Comparable<Student> {
    String name;
    int classNo;
    int total;

    public Student( String name, int classNo, int total ) {
        this.name = name;
        this.classNo = classNo;
        this.total = total;
    }

    // toString() 오버라이드
    @Override
    public String toString() {
        // String 에 해당 format 의 형태로 값을 취한 뒤 String 으로 반환한 객체를 가지고 있다
        return String.format( "[%s, %d, %d]", name, classNo, total ).toString();
    }

    public String getName() {
        return name;
    }

    public int getClassNo() {
        return classNo;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public int compareTo( Student s ) {
        // 매개변수로 받은 객체의 total  - 현재 클래스의 total 값
        return s.total - this.total;
    }

}
