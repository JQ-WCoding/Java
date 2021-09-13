package Chapter6.ch6.TvTest;

public class Tv {
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
