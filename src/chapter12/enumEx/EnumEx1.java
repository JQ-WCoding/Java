package chapter12.enumEx;

public class EnumEx1 {
    public static void main(String[] args) {
        // Enum 클래스의 값을 가져올 수 있는 다양한 방법
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 : " + d1);
        System.out.println("d2 : " + d2);
        System.out.println("d3 : " + d3);

        System.out.println("d1 == d2 : " + (d1 == d2)); // 값이 다르다 0 과 1
        System.out.println("d1 == d3 : " + (d1 == d3)); // 값이 같다 0 과 0
        System.out.println("d1.equals(d3) : " + d1.equals(d3)); // 값도 같고 주소도 같다 -> 0 과 0
//        System.out.println("d1 > d3 ? " + (d1 > d3)); -> 열거형 상수에서 비교연산자는 사용이 불가능!
        // compareTo() 메소드를 이용해야한다

        // 향상된 switch case 문이나 버전에 맞지 않음
//        String direction = switch (d1) {
//            case EAST -> // Direction.EAST 사용 불가 -> d1이 이미 사용되고 있기에
//                    "EAST"; // d1이 EAST 이기에 EAST 값만 나온다
//            case WEST -> "WEST";
//            case SOUTH -> "SOUTH";
//            case NORTH -> "NORTH";
//        };

        switch (d1) {
            case EAST:
                System.out.println("EAST");
                break;
            case SOUTH:
                System.out.println("SOUTH");
                break;
            case NORTH:
                System.out.println("NORTH");
                break;
            case WEST:
                System.out.println("WEST");
                break;
            default:
                System.out.println("INVALID");
        }

        // Enum 클래스 Direction 의 값들을 배열로 생성
        Direction[] directions = Direction.values();

        for (Direction d : directions) {
            // 해당 배열 마다의 네이밍과 해당 값을 불러온다
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
        }
    }
}
