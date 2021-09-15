package chapter9.langPackage;

public class ClassEx1 {
    public static void main(String[] args) throws Exception {
        Card2 card1 = new Card2("SPADE", 4);
        Card2 card2 = Card2.class.newInstance();
        /*
         newInstance()가 InstantiationException, IllegalAccessException 를 예외사항으로 상속받고 있기 때문에
         main() 문에 throws Exception 을 통해 부모 예외클래스 사용 -> 해당 두 예외사항 throws 가능
         */

        Class classObj = card1.getClass();

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(classObj.getName());
        System.out.println(classObj.toGenericString());
        System.out.println(classObj.toString());
    }
}
