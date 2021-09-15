package Chapter7.ch7.inheritance;

public class Tv {
    // 인스턴스 변수 power와 volume -> false와 0으로 초기화 된다
    boolean power;
    int volume;

    /**
     * 전원 켜기 / 끄기
     */
    void power() {
        power = !power;
    }

    /**
     * 볼륨 높이기
     */
    void volumeUp() {
        volume += 1;
    }

    /**
     * 볼륨 낮추기
     */
    void volumeDown() {
        --volume;
    }
}