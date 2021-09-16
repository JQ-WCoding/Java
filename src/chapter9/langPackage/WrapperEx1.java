package chapter9.langPackage;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(111); // Integer integer1 = 100; 과 같다
        Integer i2 = new Integer("111");

        String str1 = "111";

        System.out.println("i1 == i2 ? " + (i1 == i2));
        System.out.println("i1.equlas(i2) ? " + i1.equals(i2)); // primitive type 의 변수가 하나라도 있다면 값으로 비교 equals()를 사용하는 객체가 primitive type 의 Wrapper 클래스라면 값비교?
        // 둘다 같은 형일때 비교한다 -> Integer 의 equals() 의 경우 매개변수로 다른 클래스형이 받아진다면 false 를 반환한다
        System.out.println(i1.equals(str1));

        System.out.println("i1.compareTo(i2) = " + i1.compareTo(i2)); // i1 < i2 와 같이 비교할 수 없기 때문에 -> compareTo()를 사용하여 대소 비교를 한다
        System.out.println("i1.toString() = " + i1.toString());

        System.out.println("-------------------------------------");
        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE); // int 의 최대값
        System.out.println("MIX_VALUE = " + Integer.MIN_VALUE); // int 의 최소값
        System.out.println("SIZE = " + Integer.SIZE + "bits"); // 비트 크기로 반환
        System.out.println("BYTES = " + Integer.BYTES + "bytes"); // 바이트 크기러 반환
        System.out.println("TYPE = " + Integer.TYPE); // 타입 반환
    }
}
