package Chapter6.ch6.tvTest;

public class TvTest {
    public static void main(String[] args) {
        Tv newTv = new Tv(); // Tv클래스 인스턴스화 -> 객체(인스턴스화) 생성
        // 참조변수 newTv
        System.out.println("Power -> " + newTv.power); // 현재 티비가 꺼져 있는지 확인
        newTv.power(); // 전원 켜기

        // channel 기본 값 확인
        newTv.channelUp(); // 1채널로 가보기
        newTv.channelDown(); // 다시 0채널로 가보기

        newTv.sound = 10; // sound 변수 10으로 초기화
        newTv.soundDown(); // 음량 줄이기 예상값 : 9
        newTv.soundUp(); // 음량 올리기 예상값 : 10

        newTv.power(); // Tv끄기
    }
}

