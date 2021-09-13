package Chpater7.ch7.modifier;


public class FinalCardTest {
    public static void main(String[] args) {
        Card card = new Card("DIAMOND", 7);
//        card.NUMBER = 111; // final 상수를 이용했기 때문에 새로운 값으로 초기화할 수 없다
        System.out.println(card.NUMBER);
        System.out.println(card.KIND);
        System.out.println(card);
    }
}

