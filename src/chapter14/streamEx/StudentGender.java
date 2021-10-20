package chapter14.streamEx;

public class StudentGender {
    String name;
    int classNo;
    int score;
    boolean isMale;
    int grade;

    public StudentGender( String name, boolean isMale, int classNo, int grade, int score ) {
        this.name = name;
        this.isMale = isMale;
        this.classNo = classNo;
        this.grade = grade;
        this.score = score;
    }

    // toString() 오버라이드
    @Override
    public String toString() {
        // String 에 해당 format 의 형태로 값을 취한 뒤 String 으로 반환한 객체를 가지고 있다
        return String.format( "[%s, %s, %d 학년, %d 반, %3d 점]", name, isMale ? "남" : "여", grade, classNo, score );
    }

    public String getName() {
        return name;
    }

    public int getClassNo() {
        return classNo;
    }

    public int getScore() {
        return score;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getGrade() {
        return grade;
    }
}
