package chapter9.langPackage;

public class EqualsEx1 {
    public static void main(String[] args) {
        // Value 인스턴스화 2번 실행 (각각 다른 주소의 객체) 형태만 같음
        Value value1 = new Value(1);
        Value value2 = new Value(1);

        // 조건문을 이용해 equals() 메소드가 두 객체를 동일한 값으로 확인하는지 실험
        if (value1.equals(value2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // 같은 주소를 참조하도록 초기화
        value2 = value1;

        if (value1.equals(value2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /*
        equals() 는 this 를 이용하여 (this == obj)를 반환한다
        따라서 본인 객체가 아니면 (주소가 같은) 다르게 취급한다 -> String 은 StringPool 로 인하여 동일한 값은 한주소를 같이 참조하기 때문에 equals() 사용해도 true 를 반환하는 것
         */
    }
}
