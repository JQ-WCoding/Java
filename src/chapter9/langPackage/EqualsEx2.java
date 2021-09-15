package chapter9.langPackage;

public class EqualsEx2 {
    public static void main(String[] args) {
        Card card1 = new Card(132455561415L);
        Card card2 = new Card(132455561415L);

        if (card1 == card2) { // 동일한 주소를 가진 객체인가요? -> false
            System.out.println("same card");
        } else {
            System.out.println("different card");
        }

        if (card1.equals(card2)) { // 단순 값비교로 오버라이딩된 메소드이기 떄문에 true 블록이 출력된다 -> 오버라이딩 하지 않았으면 false 반환
            System.out.println("same card");
        } else {
            System.out.println("different card");
        }
    }
}
