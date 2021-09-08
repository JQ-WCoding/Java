package Chapter6.ch6.TvTest;

public class TvTest3 {
    public static void main(String[] args) {
        // 주소를 동일하게 일치시키면 서로 영향을 미치는지 확인하는 작업
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        // tv1과 tv2의 초기값(default)값 확인
        System.out.println("Before");
        System.out.println("tv1 channel : " + tv1.channel);
        System.out.println("tv2 channel : " + tv2.channel);

        // tv1의 주소를 tv2의 주소로 초기화 하였다. 즉, tv1은 tv2가 가진 메모리 주소를 바라보고 있다 -> tv2의 변화에 tv1이 같이 반응할 것이다
        tv1 = tv2;

        tv2.channel = 10;

        // 10으로 tv2의 채널을 초기화한 이후
        System.out.println("After");
        System.out.println("tv1 channel : " + tv1.channel);
        System.out.println("tv2 channel : " + tv2.channel);

        // 추가사항 tv1의 채널 값을 바꾸면?
        tv1.channel = 20;
        System.out.println("One more thing");
        System.out.println("tv1 channel : " + tv1.channel);
        System.out.println("tv2 channel : " + tv2.channel);

        // 동일한 값이 출력된다 -> tv1 과 tv2가 바라보는 메모리 공간의 주소가 동일하기 때문에 tv1의 변화는 B 메모리 영역에 영향을 주고 tv2도 B를 바라보고 있다.
        // A(처음 tv1 인스턴스화 한 시점의 메모리 공간)는 사용되지 않으며, 가비지 콜렉터로 자동 처리된다
    }
}
