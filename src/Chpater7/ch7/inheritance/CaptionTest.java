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

