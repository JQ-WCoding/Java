package Chpater7.ch7.inheritance;

public class Deck {
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
