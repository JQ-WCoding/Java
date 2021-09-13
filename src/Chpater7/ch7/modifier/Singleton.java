package Chpater7.ch7.modifier;

// 싱글톤 클래스임을 명시하기 위해 접근제어자를 final로 설정하는 것이 좋다
final class Singleton {
    private static Singleton singleton = new Singleton();
    // 궁금증 ? -> 왜 private static Singleton singleton으로 선언만 해두지 않을까?

    // 기본 생성자
    private Singleton() {

    }

    // 접근제어자가 private 기본생성자를 생성하기 위해 접근제어자 public(외부에서 접근가능)을 사용해 getInstance() 메소드를 만들어 중복 인스턴스화 되지 않도록 한다
    public static Singleton getInstance() {
        System.out.println(singleton);
        // 만약 singleton 객체가 이미 선언되어 있다면 null이 아니기 때문에 생성자를 호출하지 않는다.
        if (singleton == null) {
            singleton = new Singleton();
            System.out.println("11111");
        }
        return singleton; // 만약 null이 아니라면 이미 클래스 참조변수인 singleton을 반환하여 하나만 유지될 수 있도록 해준다
    }
}