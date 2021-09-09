package Chpater7.ch7.inheritance;

public class CaptionTest {
    public static void main(String[] args) {
        // CaptionTv 인스턴스화
        CaptionTv captionTv = new CaptionTv();
        // 참조변수 captionTv의 인스턴스변수 volume 5로 초기화
        captionTv.volume = 5; // 해당 변수는 CaptionTv클래스가 상속받은 Tv 클래스의 인스턴스 변수이다
        captionTv.volumeDown(); // 볼륨 낮추기
        System.out.println(captionTv.volume); // 예상값 : 4

        // 문자열 "HI" 인자값
        captionTv.screenCaption("Hi");
        // -> caption이 기본값 false로 초기화 되어 있어 조건문 내부를 실행하지 못했다.
        captionTv.caption = true; // caption은 CaptionTv 클래스의 인스턴스 변수

        captionTv.screenCaption("Hi~"); // 해당 결과값은 출력이 되어야한다. -> caption이 true이기 때문에
    }
}

class Tv {
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

// Tv를 상속받은 CaptionTv 클래스
class CaptionTv extends Tv {
    // 인스턴스 변수 caption은 Tv에는 없고 CaptionTv에 존재하는 변수이다
    boolean caption;

    // String형을 인자값으로 받아
    void screenCaption(String text) {
        // caption이 true인 경우 매개변수 text를 출력하는 메소드
        if (caption) {
            System.out.println(text);
        }
    }

}