package Chpater7.ch7.inheritance;

class TVCR extends Tv {
    /*
     VCR을 인스턴스화 하여 TV를 상속한과 같은 형식을 표현
     -> 그렇다면 TVCR.power = true로 변경한다면 TV의 인스턴스 변수인 power의 값이 초기화 되는 것
     -> VCR의 power는 vcr.power 변수를 이용해 초기화하지 않으면 TVCR의 power와는 연관이 없다 -> 같은 주소를 바라보고 있지 않는다
     예를들어, TVCR이 켜지면 TV에 상속된 power on이 되고 vcr은 같이 켜지지 않고 따로 켜줘야하는 DVD기기 같은 느낌(혹은 세톱박스)
     */
    VCR vcr = new VCR();
    int channel = vcr.channel;

    //  TVCR의 play() 메소드는 VCR의 play메소드를 실행하는 것과 같다
    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }
}