package chapter12.enumEx;

enum Direction2 {
    // enum 클래스에 각각 특정한 값으로 세팅하기 위해서는 생성자도 함께 필요
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    private static final Direction2[] DIR_ARR = Direction2.values();
    // enum 보편적으로 상수를 사용하기에 final 로 선언하고 setter 없이 생성자에서 값 초기화 후 변화 불가
    private final int value;
    private final String symbol;

    // 생성자에서 생성과 동시에 변수 값 초기화
    Direction2(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    // of() -> parameter dir 값이 1 보다 작거나 4보다 크면 -> 동서남북이 아닐경우
    public static Direction2 of(int dir) {
        if (dir < 1 || dir > 4) {
            // 예외처리
            throw new IllegalArgumentException("Invalid " + dir);
        }
        // 아니라면 배열이기에 0 ~ 3까지 방으로 적용되어 -1 하였다
        return DIR_ARR[dir - 1];
    }

    public Direction2 rotate(int num) {
        // num = num % 4
        num %= 4;
        // num 이 0 보다 작으면
        if (num < 0) {
            // 4씩 추가한다
            num += 4;
        }
        // 돌아가는 이동을 표현하기 위해 -> 한바퀴는 총 값이 4씩 차이난다
        return DIR_ARR[(value - 1 + num) % 4];
    }

    @Override
    public String toString() {
        // 이름과 심볼을 가져온다
        // name() 메소드는 enum 추상클래스에 선언되어 있다
        return name() + getSymbol();
    }
}
