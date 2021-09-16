package chapter9.langPackage;

public class ClassEx1 {
    public static void main(String[] args) throws Exception {
        // 인스턴스화시 해당 인자값으로 초기화하여 반환
        Card2 card1 = new Card2("SPADE", 4);
        // new Card2()와 같은 인스턴스화 과정 -> class 객체를 이용해 인스턴스화 가능
        // 9버전 이후 deprecated -> 추천하지 않는 방법
        Card2 card2 = Card2.class.newInstance();
        /*
         newInstance()가 InstantiationException, IllegalAccessException 를 예외사항으로 상속받고 있기 때문에
         main() 문에 throws Exception 을 통해 부모 예외클래스 사용 -> 해당 두 예외사항 throws 가능
         */

        Class classObj = card1.getClass();

        System.out.println(card1);
        System.out.println(card2);
        // 클래스명 반환
        System.out.println(classObj.getName());
        // toGenericString() -> 접근제어자와 타입을 포함한 값을 반환
        System.out.println(classObj.toGenericString());
        System.out.println(classObj.toString());
    }
}
