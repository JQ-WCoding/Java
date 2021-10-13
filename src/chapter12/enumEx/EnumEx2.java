package chapter12.enumEx;

public class EnumEx2 {
    public static void main(String[] args) {
        // 반복문을 통해 -> enum Direction2 의 값을 모두 출력해본다
        for (Direction2 d : Direction2.values()) {
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        }

        Direction2 d1 = Direction2.WEST;
        // 1의 값이 표현하는 위치는 enum 값은 무엇인지
        Direction2 d2 = Direction2.of(1);
        // 이름과 값 불러오기
        System.out.printf("d1 = %s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2 = %s, %d%n", d2.name(), d2.getValue());

        // 이동 -> 방향이동과 같다 90도 돌면 어느방향을 보고 있는지 판단하기 위한 메소드
        // rotate()
        // 항상 Direction2의 EAST 값을 기준으로 하고 있다
        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(3));
        System.out.println(Direction2.EAST.rotate(-3));
        // 4씩 차이나면 원점으로 돌아올까?
        System.out.println(Direction2.EAST.rotate(-4));
    }
}
