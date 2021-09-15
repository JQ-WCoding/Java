package Chapter7.ch7.inheritance;


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