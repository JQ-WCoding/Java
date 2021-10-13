package chapter12.enumEx;

public class EnumEx3 {
    public static void main(String[] args) {
        // 거리가 100인 경우의 버스 운임요금
        System.out.println("bus fare : " + Transportation.BUS.fare(100));
        System.out.println("train fare : " + Transportation.TRAIN.fare(200));
        System.out.println("ship fare : " + Transportation.SHIP.fare(100));
        System.out.println("airplane fare : " + Transportation.AIRPLANE.fare(100));

        // 거리가 같아도 기본 운임료 때문에 값이 달라지지만 -> 추가로 거리에 대한 조정도 해보았다
    }
}
