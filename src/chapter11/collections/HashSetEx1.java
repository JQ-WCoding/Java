package chapter11.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "4", "4"};
        // Set Collection 중 구현된 HashSet 쿨래스 인스턴스화
        Set set = new HashSet();

        // Object 값을 HashSet 객체에 모두 저장
        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        // 출력문
        // 1, 1, 2, 3, 4
        // 위와 같이 출력되는 이유는 1은 표현값은 같지만 첫번째 1은 String 이고, 두번째는 Integer 쿨래스를 이기에 형태가 다른 객체를 사용하고 있기 때문에 중복 삭제되지 않았다
        System.out.println(set);
    }
}
