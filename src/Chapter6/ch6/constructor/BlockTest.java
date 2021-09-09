package Chapter6.ch6.constructor;

public class BlockTest {

    static {
        System.out.println("static { } ");
    }

    {
        System.out.println("{ }");
    }

    BlockTest() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        // static 클래스 초기화 블럭이 존재하기 때문에 main() 실행 전 -> BlockTest클래스 내의 초기화 블럭부터 실행 한 후 main()문으로 넘어간다
        System.out.println("BlockTest -> ");
        /*
         이후 인스턴스화 과정을 진행하면서 -> 인스턴스 초기화 블럭이 실행되는 것을 알 수 있다
         해당 인스턴스 블럭과 생성자 중 인스턴스 블럭이 먼저 실행된다 -> 인스턴스화 과정에서 인스턴스 블럭 이후 생성자의 실행을 확인 가능
         */
        BlockTest blockTest = new BlockTest();
    }
}
