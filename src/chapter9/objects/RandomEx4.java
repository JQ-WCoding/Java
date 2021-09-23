package chapter9.objects;

public class RandomEx4 {
    // final static 임으로 인스턴스하지 않고 참조가능하며, 상수임으로 변경하지 않는다
    final static int INSERT_NUM = 10;
    final static String TB_NAME = "TEST_TABLE";
    final static String[] CODE1 = {"010", "011", "017", "080", "070"};
    final static String[] CODE2 = {"Man", "Woman"};
    final static String[] CODE3 = {"10s", "20s", "30s", "40s", "50s"};

    public static void main(String[] args) {
        for (int i = 0; i < INSERT_NUM; i++) {
            // sql 구문 자동생성 -> getRandomArr() 을 통해 인자값 해당 배열 내의 값 중 랜던함 값을 출력 , 마지막 getRandom() 은 from, to 사이의 int 형 정수를 반환
            System.out.println("INSERT INTO " + TB_NAME + " VALUES('" + getRandomArr(CODE1) + "', '" + getRandomArr(CODE2) + "', '" + getRandomArr(CODE3) + "', " + getRandom(10, 20) + ");");
        }
    }

    public static String getRandomArr(String[] strArr) {
        return strArr[getRandom(strArr.length - 1)];
    }

    public static int getRandom(int num) {
        return getRandom(0, num);
    }

    public static int getRandom(int from, int to) {
        return (int) (Math.random() * (Math.abs(to - from) + 1) + Math.min(from, to));
    }
}
