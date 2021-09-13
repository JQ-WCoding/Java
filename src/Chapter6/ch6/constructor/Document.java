package Chapter6.ch6.constructor;

public class Document {
    // 클래스 변수 count
    static int count = 0;
    // 인스턴스 변수 name -> 만약 클래스 변수로 선언하면 파일명이 계속 사용됨으로 인스턴스 변수가 더 적합하다
    String name;

    // 기본 생성자의 경우 -> 기본값(default)으로 no name으로 생성된다
    Document() {
        this("no name" + ++count); // -> no name에만 count가 있는 이유 : 같은 이름의 파일이기 때문에 이름없음1,2,3..와 같이 구분을 위해
    }

    // 매개변수 name을 인자로 입력시 클래스 변수 name값이 해당 매개변수의 값으로 초기화 되어 출력문에 출력된다
    Document(String name) {
        this.name = name;
        System.out.println(this.name + " created");
    }
}
