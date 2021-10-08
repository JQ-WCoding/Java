package chapter11.collections;

import java.util.Comparator;

public class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        // Comparable 인터페이스를 상속받았는지 확인을 위함
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            // 두가지 경우 모두 상속받았을 경우에 형변환을 통해 참조형 Comparable 로 초기화
            Comparable comparable1 = (Comparable) o1;
            Comparable comparable2 = (Comparable) o2;

            return comparable1.compareTo(comparable2) * -1;
            // compareTo() 비교적보다 크기가 작으면 -1 , 같으면 0, 더 크면 1로 반환
            // 반환 값에 부호를 변경해 반환하는 메소드
        }
        // 둘중 하나라도 비교 불가능한 상황(Comparable 미상속)인 경우 -1로 반환
        return -1;
    }
}
