package Chapter6.ch6.constructor;

public class CarTest2 {
    public static void main(String[] args) {
        // 기본생성자로 인스턴스화된 car1
        Car2 car1 = new Car2();
        // 인자값을 1개만 넣어 인스턴스화한 car2
        Car2 car2 = new Car2("black");
        // 인자값 3개를 모두 넣어 인스턴스화한 car3
        Car2 car3 = new Car2("red", "SUV", 4);

        // car1,2,3에 대한 출력문 인스턴스 변수가 올바르게 초기화되었는지 확인
        System.out.printf("car1 : %s\t%s\t%d\n",car1.color,car1.type,car1.door);
        System.out.printf("car2 : %s\t%s\t%d\n",car2.color,car2.type,car2.door);
        System.out.printf("car3 : %s\t%s\t%d\n",car3.color,car3.type,car3.door);
    }
}
