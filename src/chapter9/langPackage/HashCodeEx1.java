package chapter9.langPackage;

public class HashCodeEx1 {
    public static void main(String[] args) {
        String words1 = new String("words");
        String words2 = new String("words");
//        String words1 = "words";
//        String words2 = "words";

        System.out.println(words1.equals(words2));
        System.out.println(words1.hashCode());
        System.out.println(words2.hashCode());
        // String 클래스의 hashCode() 오버라이딩으로 인해 문자열이 같으면 동일한 해쉬코드값을 반환 받는다
        System.out.println(System.identityHashCode(words1)); // 하지만 해쉬코드는 달라(주소가 다르다) -> 서로 다른 객체임을 알 수 있다
        System.out.println(System.identityHashCode(words2));
        /*
        위와 같이 String 인데 주소가 다른 이유는 new String() 을 통해 인스턴스화 시킴으로 StringPool 의 특징은 값이 동일하면 같은 주소를 참조하는 형식이 아니라 값이 같더라도 서로 다른 메모리 영역에 새로 생성되어 값을 가지고 있다
         */
    }
}
