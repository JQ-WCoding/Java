package chapter12.enumEx;

public class EnumEx4 {
    public static void main(String[] args) {
        // MyTransportation 내에 각각 하나의 클래스와 같다
        MyTransportation t1 = MyTransportation.BUS;
        MyTransportation t2 = MyTransportation.BUS;
        MyTransportation t3 = MyTransportation.TRAIN;
        MyTransportation t4 = MyTransportation.SHIP;
        MyTransportation t5 = MyTransportation.AIRPLANE;

        System.out.printf("t1=%s, %d%n", t1.name, t1.getOrdinal());
        System.out.printf("t2=%s, %d%n", t2.name, t2.getOrdinal());
        System.out.printf("t3=%s, %d%n", t3.name, t3.getOrdinal());
        System.out.printf("t4=%s, %d%n", t4.name, t4.getOrdinal());
        System.out.printf("t5=%s, %d%n", t5.name, t5.getOrdinal());

        System.out.println("t1==t2 ? " + (t1 == t2));
        System.out.println("t1.compareTo(t3) = " + t1.compareTo(t3));
    }
}
