package Chapter6.ch6.call;

public class MemberCall {
    int instanceVar = 1;
    static int classVar = 2;

    int instanceVar2 = instanceVar; // 인스턴스 변수2에 인스턴스 변수1의 값으로 초기화가 가능한 이유는 두 변수모두 전재조건인 인스턴스화를 행해야하기 때문이다
//    static int classVar2 = instanceVar // 불가능 : 인스턴스화해야 사용가능한 변수를 static인 클래스 변수에서 인스턴스화 하지않고 즉시 사용할 수 없기 때문에
    static int classVar2 = new MemberCall().instanceVar; // 인스턴스화 진행 후 해당 변수 값으로 초기화
    
    static void staticMethod(){
        System.out.println(classVar);
//        System.out.println(instanceVar); // error, static인 클래스 메소드에서 인스턴스 변수를 출력할 수 없다 -> 인스턴스화 과정을 거쳤는지 알 수 없기 때문
        MemberCall memberCall = new MemberCall(); // MemberCall 인스턴스화 -> 이후 인스턴스 변수 출력 가능
        System.out.println(memberCall.instanceVar);
    }

    void instanceMethod(){
        /*
        클래스 변수와 인스턴스 변수가 모두 출력 가능한 이유:
        인스턴스 메소드이기에 인스턴스화 작업을 거치지 않고는 호출할 수 없는 메소드이다. 따라서 전재조건이 실행되어야 호출이 되는 메소드이기에 이후 내용이 실행된다
         */
        System.out.println(classVar);
        System.out.println(instanceVar);
    }

    static void staticMethod2(){
        staticMethod(); // 클래스 메소드는 인스턴스화를 거치지 않기 때문에 메소드의 범위에 상관없이 사용가능
//        instanceMethod(); // 인스턴스 메소드는 인스턴스화를 거치지 않으면 사용 불가능
        MemberCall memberCall = new MemberCall(); // 인스턴스화 작업
        memberCall.instanceMethod();
    }

    void instanceMethod2(){
        // 해당 전제조건이 충족되어야 실행된다 -> 변수와 메소드 모두 동일하다
        staticMethod2();
        instanceMethod();
    }

}
