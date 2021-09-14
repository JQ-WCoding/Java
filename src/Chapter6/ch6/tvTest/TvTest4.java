package Chapter6.ch6.tvTest;

public class TvTest4 {
    public static void main(String[] args) {
        // 객체배열 -> 총 4개의 Tv 클래스를 인스턴스화한 객체를 만들 공간을 확보
        Tv[] tvArr = new Tv[4];

        // 0 ~ (tv 배열의 길이 -1) 만큼 반복
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv(); // tvArr 배열에 tv 인스턴스화
            tvArr[i].channel = i + 1; // 각 tv객체의 채널에 i + 1을 초기화
            System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel); // 초기화한 값이 잘 등록되었는지 확인
        }

        // 각 객체의 channel이 한채널씩 올렸을 경우, 몇번인지 확인하기 위한 출력문
        for (int i = 0; i < tvArr.length; i++) {
            System.out.printf("tvArr[%d].channel = ", i);
            tvArr[i].channelUp(); // channelUp 메소드 내에 출력문이 포함되어 있다
        }
    }
}
