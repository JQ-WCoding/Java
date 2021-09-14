package Chapter6.ch6.tvTest;

public class TvTest2 {
    public static void main(String[] args) {
        // newTv1, 2라는 인스턴스를 두개 생성한다 (각기 다른 주소를 통해 참조한다)
        Tv newTv1 = new Tv(); // newTv1 != newTv2
        Tv newTv2 = new Tv();

        // Tv1 과 2의 기본 채널 값을 확인
        System.out.println("Before");
        System.out.println("newTv1.channel : " + newTv1.channel);
        System.out.println("newTv2.channel : " + newTv2.channel);

        newTv1.channel = 10;
        
        // newTv1의 멤버변수 channel을 10으로 초기화 한 후 확인했을 때 newTv2에도 영향이 가는지 확인해보는 작업 -> 다른 주소에서 참조해오기에 관련이 없다
        System.out.println("After");
        System.out.println("newTv1.channel : " + newTv1.channel);
        System.out.println("newTv2.channel : " + newTv2.channel);
    }
}
