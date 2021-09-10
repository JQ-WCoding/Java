package Chpater7.ch7.inheritance;

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

class Deck {
    final int CARD_NUM = 52; // 총 카드 개수 -> 52개
    Card[] cards = new Card[CARD_NUM]; // 카드 배열 크기를 포함하여 선언

    // 카드뭉치(덱)을 구성하는 전반적인 과정 -> 기본 생성자 -> 인스턴스화 선인시 무조건 카드 배열안에 값들을 초기화시켜 덱을 구성
    Deck() {
        // x는 cards의 배열에 처음부터 끝까지 중복되지 않고 값을 초기화 시키기위한 순서같은 변수
        int x = 0;

        for (int i = Card.KIND_MAX; i > 0; i--) { // for문 반복문을 ++가 아닌 -- 로 감소를 진행과정으로 실시하면 속도가 조금 더 빠르다
            // 메모리를 전체 할당하고 계산을 진행하는 것이 공간을 증가에 따라 계속 넓혀가는 것보다 계산 속도가 빠르다 -> 큰수의 반복문일때
            for (int j = 0; j < Card.NUM_MAX; j++) {
                cards[x++] = new Card(i, j + 1); // x는 0부터 1씩 꾸준하게 증가한다
            }
        }
    }

    /**
     * 카드 뽑기(고르기)
     *
     * @param index
     * @return cards[index]
     */
    Card pick(int index) {
        // 매개변수 index를 받아 카드 배열에서 몇번째 카드를 뽑았는지 Card 클래스형으로 반환해준다 -> kind와 number 변수의 값을 알기 위해
        return cards[index];
    }

    /**
     * 카드 고르기 오버로드
     *
     * @return pick(index)
     */
    Card pick() {
        /*
         인자값을 전달하지 않고 메소드를 작성한 경우 전체카드 수 범위 내의 랜덤한 숫자가 멤버변수 index에 초기화 된다
         해당 index를 인자값으로 한 pick()메소드를 다시 반환하는 역할을 한다
         */
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    /**
     * 카드 섞기
     */
    void shuffle() {
        // 반복문을 통해 카드 전체의 범위만큼 랜덤하게 카드의 값을 변경해준다(같은 값이어서 한두번 섞이지 않을 수 있음)
        for (int i = 0; i < cards.length; i++) {
            int random = (int) (Math.random() * CARD_NUM);

            Card temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
    }
}

class Card {
    // 상수로 선언 -> 카드의 종류와 갯수와 변동될 일이 없이 때문에 클래스 변수(static)이며 상수형으로 선언
    static final int KIND_MAX = 4; // 카드 종류 : 총 4개
    static final int NUM_MAX = 13; // 한 종류의 카드 숫자 : 13;

    // 카드 종류 상수로 표현 1,2,3,4 각각 카드의 종류를 의미
    static final int SPADE = 1;
    static final int DIAMOND = 2;
    static final int HEART = 3;
    static final int CLOVER = 4;

    int kind;
    int number;

    // 기본 생성자 -> kind는 SPADE(1) 과 number 1로 인스턴스변수의 값이 초기화된다
    Card() {
        this(SPADE, 1);
    }

    // 매개변수를 이용하여 인스턴스변수 값을 생성과 특정 값으로 동시에 초기화하는 생성자
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    /*
     기본적으로 모든 클래스에 포함되어 있는 toString() 메소드는 overriding 하여 사용자의 정의에 맞게 구성가능하다
     현재 정의한 toString() 메소드는 해당 클래스의 구성 요소를 문자열로 반환해주는 메소드
     */
    @Override
    public String toString() {
        String[] kinds = {"", "SPADE", "DIAMOND", "HEART", "CLOVER"};
        String numbers = "123456789XJQK"; // 0 대신 한칸 띄어쓰기로 표현 -> 띄어쓰기 한 이유는 charAt()메소드가 0부터 시작하기 때문에 카드의 숫자를 1부터 표현하기 위해 한칸 띄워 사용

        return "kind : " + kinds[this.kind] + " , number : " + numbers.charAt(this.number - 1); //  numbers에 띄어쓰기를 하지 않고 numbers.charAt(this.number-1)로 사용도 가능
    }
}