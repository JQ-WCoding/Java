package Chapter6.ch6.TvTest;

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

class Tv {
    // 멤버 변수
    // int형 기본값 : 0, boolean 기본값 : fasle
    String color; // 색상
    boolean power; // 전원상태 -> 기본값 : false
    int sound; // 음량 조절
    int channel; // 채널 변경

    /**
     * 전원 상태 전환 (켜고/끄기) 를 위한 메소드
     */
    public void power() {
        power = !power;

        // 파워의 상태에 따른 전원 상태 알림
        if (power) {
            System.out.println("Power on");
        } else {
            System.out.println("Power off");
        }
    }

    /**
     * 채널 올리기
     */
    public void channelUp() {
        ++channel;
        System.out.println("Now watching : " + channel);
    }

    /**
     * 채널 내리기
     */
    public void channelDown() {
        --channel;
        System.out.println("Now watching : " + channel);
    }

    /**
     * 볼륨 업
     */
    public void soundUp() {
        ++sound;
        System.out.println("volume : " + sound);
    }

    /**
     * 볼륨 다운
     */
    public void soundDown() {
        --sound;
        System.out.println("volume : " + sound);
    }
}
