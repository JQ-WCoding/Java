package chapter12.enumEx;

public enum Transportation {
    // enum 이란 결국 하나하나 각기 다른 값을 가진 클래스를 인스턴스화한 값을 미리 선언해두는 것과 같다
    // House 에서 만약 A,B,C 타입 집이 정말 온전하게 사용된다면 enum 으로 만들어볼 수 있을거 같다

    // 추상메소드를 선언함으로서 -> enum 클래스 내부의 선언체마다 각각 추상 메소드의
    // 구현체를 올바르게 작성해주어야 한다
    // 지금은 동일하지만 원래 각기 다르게 사용될 수 있는것 ->  거리를 추가적으로 늘어나는 값으로 변경
    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    }, TRAIN(200) {
        int fare(int distance) {
            return (distance / 2) * BASIC_FARE;
        }
    }, SHIP(300) {
        int fare(int distance) {
            return (distance * 2) * BASIC_FARE;
        }
    }, AIRPLANE(400) {
        int fare(int distance) {
            return (distance * 4) * BASIC_FARE;
        }
    };


    protected final int BASIC_FARE; // 기본요금

    Transportation(int basicFare) {
        this.BASIC_FARE = basicFare;
    }

    public int getBASIC_FARE() {
        return BASIC_FARE;
    }

    // 추상 메소드 선언
    abstract int fare(int distance);
    // 사실 많이 사용할일이 없다고 한다
}
