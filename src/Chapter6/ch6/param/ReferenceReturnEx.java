package Chapter6.ch6.param;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        // Data 클래스 인스턴스화
        Data data = new Data();

        // 참조변수 data의 x값을 4로 초기화 한다.
        data.x = 4;

        /*
         이후 -> 참조변수 data2를 선언하면서 copy()를 통해 임의의 참조변수 temp를 생성
         해당 temp.x에 data.x의 값으로 초기화한다
         */
        Data data2 = copy(data);
        System.out.println("Data -> x : " + data.x);
        System.out.println("Data2 -> x : " + data2.x);

        /*
        (추가 실험)
         data2.x의 값만 변경해 보았다.
         */
        data2.x = 7;
        System.out.println("One more thing");
        System.out.println("Data -> x : " + data.x);
        System.out.println("Data2 -> x : " + data2.x);
        // 다른 주소이기에 data2.x의 값이 변경되었다 해서 data.x의 값이 변경되지 않았음을 알 수 있다.
    }

    /**
     * 값 복사하기
     * @param data
     * @return temp
     */
    static Data copy(Data data) {
        Data temp = new Data();
        /*
         참조변수 temp는 새로운 주소를 가진 Data클래스의 객체이다 -> 따라서 매개변수로 넘어온 data의 주소와는 다른 주소를 가지고 있다.
         값을 대입할 뿐 주소를 초기화하는 것이 아니다
         */
        temp.x = data.x;

        // temp 반환
        return temp;
    }
}

