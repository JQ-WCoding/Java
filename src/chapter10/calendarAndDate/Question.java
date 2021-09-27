package chapter10.calendarAndDate;

public class Question {
    public static void main(String[] args) {

    }
}

class Test {
    private int num;

    Test(int num) {
        // 그럼 얘는 무결성을 안지키고 있는걸까?
        this.num = num;
        setNum(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    void up(int num) {
        setNum(num);

        this.num = num;
    }
}
