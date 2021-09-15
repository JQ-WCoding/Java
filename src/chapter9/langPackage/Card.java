package chapter9.langPackage;

public class Card {
    long id;

    /*
     매개변수로 받은 obj 가 null 이 아니고 (and) Card 객체를 구성으로(상속) 받고 있다면 if 블록 실행
     id 는 obj 를 Card 형으로 변환한 id 인스턴스 변수 값으로 초기화 한다
     equals() 를 통해 객체 주소의 비교가 아닌 단순 값 비교가능
     */
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Card) {
            return id == ((Card) obj).id;
        } else {
            return false;
        }
    }

    // 생성자
    Card(long id) {
        this.id = id;
    }
}
