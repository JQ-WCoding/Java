package Chapter7.ch7.inheritance;

public class DeckTest {
    public static void main(String[] args) {
        // Deck 클래스를 인스턴스화 시켰다 -> 기본생성자를 통해 cards 인스턴스 배열이 초기화 된다.
        Deck deck = new Deck();
        // 참조변수 deck의 pick() 메소드를 사용 -> 인자값이 없기 때문에 랜덤한 index를 가지고 pick(int index)메소드를 거쳐 값이 값이 반환
        Card card = deck.pick();
        // card 출력문
        System.out.println(card); // card.toString()과 동일하다 -> println()메소드 내부를 보면 삼항연산자를 통해 객체가 null이 아니면 객체.toString()으로 반환하는 과정이 존재
        // 따라서, 간단하게 참조변수(객체)만 println에 인자값으로 부여하면 객체.toString()으로 반환된 값이 출력되는 것이다. -> 사용자가 커스텀하여 주소값으로 보내기도 가능할거 같다

        // 랜덤하게 52번 카드 섞기
        deck.shuffle();
        // 참조변수 card에 0을 인자값으로 설정한 pick()메소드를 실행 -> 가장 첫번째 카드를 확인
        card = deck.pick(0);
        // 카드 출력문
        System.out.println(card);
    }
}


