package Chapter6.ch6.CardTest;

public class CardTest {
    public static void main(String[] args) {
        // 클래스 변수이기 때문에 인스턴스화 하지 않아도 해당 객체의 변수 값을 확인할 수 있다.
        System.out.println(Card.width);
        System.out.println(Card.height);

        // 영향을 미치는지 확인해보는 작업
//        Card.height = 100;
//        System.out.println(Card.height);

        // Card 클래스를 인스턴스화 하여 card1 생성
        Card card1 = new Card();
//        System.out.println(card1.height); // -> 출력은 가능
//        System.out.println(card1.kind); // -> 초기값임으로 null
        card1.kind = "Spade";
        card1.number = 10;

        Card card2 = new Card();
        card2.kind = "Clover";
        card2.number = 4;

        // card1 과 card2 두 참조변수의 각각 지정된 인스턴스 변수의 값과 클래스 변수(?)의 값을 확인
        System.out.println("card1 : " + card1.kind + ", " + card1.number + ", " + card1.width + ", " + card1.height);
        System.out.println("card2 : " + card2.kind + ", " + card2.number + ", " + card2.width + ", " + card2.height);

        // card1의 height와 width를 50, 50으로 변경한다
        card1.height = 50;
        card1.width = 50;
        System.out.println("card1 : " + card1.kind + ", " + card1.number + ", " + card1.width + ", " + card1.height);
        System.out.println("card2 : " + card2.kind + ", " + card2.number + ", " + card2.width + ", " + card2.height);
        // 위의 결과를 통해 card1의 heigthdhk width 모두 클래스 변수의 주소와 연결되어 있다. 따라서, 한 참조변수의 해당 클래스 변수를 변경하면 전체에도 영향을 미치게 된다 ** 중요
    }
}
