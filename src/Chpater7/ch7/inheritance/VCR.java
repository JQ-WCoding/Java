package Chpater7.ch7.inheritance;

public class VCR {
    // 인스턴스 변수 power와 channel;
    boolean power;
    int channel = 0;

    void play() {
        ++channel;
    }

    void stop() {
        --channel;
    }
}