package chapter11.collections;

import java.util.*;

public class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        // T... elements 두번째 인자값으로 설정 ...args 와 같이 ...은 이후 다중의 매개변수를 필요로할 경우 제한없이 넣을 수 있다는 의미이다
        // list 변수에 두번째 이후 인자값들 모두 초기화
        System.out.println("List");
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        // 우측으로 값을 2자리씩 이동
        System.out.println("Rotate");
        Collections.rotate(list, 2);
        System.out.println(list);
        // - 부호 인자값을 넣으니 반대로 좌측으로 이동한다
        Collections.rotate(list, -2);
        System.out.println(list);

        System.out.println("Swap");
        // 0번째 자리 값과 2번째 자리 값을 변경
        Collections.swap(list, 0, 2);
        System.out.println(list);

        System.out.println("Shuffle");
        // list 내에 저장된 값을 임의로 섞기
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("Sort");
        // list 정렬
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Reverse");
//        Collections.sort(list, Collections.reverseOrder());
        Collections.reverse(list);
        System.out.println(list);

        // 1 이 저장된 인덱스(순서) 값을 가져와 index 변수에 초기화
        int index = Collections.binarySearch(list, 1);
        System.out.println("index of 1 : " + index);

        System.out.println("max : " + Collections.max(list));
        System.out.println("min : " + Collections.min(list));
        System.out.println("min : " + Collections.max(list, Collections.reverseOrder()));
//        System.out.println("min : " + Collections.max(Collections.reverse(list))); -> reverse() 메소드는 반환값이 없는 void 메소드이기에 출력을 저렇게 할수 없당

        // list 를 9로 전부 초기화
//        Arrays.fill(list, 9) 행동이 비슷
        Collections.fill(list, 9);
        System.out.println("List : " + list);

        List newList = Collections.nCopies(list.size(), 1);
        System.out.println("newList : " + newList);

        System.out.println(Collections.disjoint(list, newList));

        Collections.copy(list, newList);
        System.out.println("newList : " + newList);
        System.out.println("list : " + list);

        System.out.println("ReplaceAll");
        Collections.replaceAll(list, 1, 4);
//        Collections.replaceAll(newList, 1, 4); // newList 는 값 변경 불가능
        System.out.println("list : " + list);

        // Enumeration 인터페이스를 사용하여
        // ArrayList 로 list 를 변환시켜주었다 -> 근데 왜 단순하게 형변환으로 안되는걸까? 반환값이 달라서 ?
        // 상속되어 있지 않은 클래스의 경우 메소드를 통해 전환이 필요할 수 있음
        Enumeration enumeration = Collections.enumeration(list);
        ArrayList list2 = Collections.list(enumeration);

        System.out.println("list2 : " + list2);

        // List Set 등의 구현체는 목적성에 따라 조금씩 다른 성능을 가지고 있다 -> 내가 필요로하는 우선시해야하는 목적에 우선시한 클래스로 구현하여 사용하는 것이 현명
        // ex) 아무거나 막 List 구나? 하고 ArrayList 사용하지 말자
    }
}
