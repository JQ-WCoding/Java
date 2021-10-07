package chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        // capacity 가 10인 ArrayList 3개 생성
        ArrayList original = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        // 0 ~ 9 까지 값을 original 변수에 초기화
        for (int i = 0; i < 10; i++) {
            original.add(i + "");
        }

        // Iterator 참조변수
        Iterator iterator = original.iterator(); // original 값을 iterator() 사용해 반환 반환 오브젝트 ArrayList();

        while (iterator.hasNext()) { // 값이 존재하는 한
            copy1.add(iterator.next()); // copy1에 값 입력
        }

        System.out.println("original -> copy1 :");
        System.out.println("original : " + original);
        System.out.println("copy1 : " + copy1);
        System.out.println();

        iterator = original.iterator(); // Iterator 는 싱글톤???

        while (iterator.hasNext()) {
            copy2.add(iterator.next());
            iterator.remove(); // iterator 변수에 값 삭제
            // next()와 함께 remove()를 사용하여 값을 가져옴과 동시에 해당 값을 삭제하여 저장값을 남기지 않는다
            // ex) 메일을 가져오면서 서버에 남길 것인지 혹은 안남기고 삭제할 것인지 해당 목적성에 따라 다르게 사용하면 된다
        }

        System.out.println("original -> copy2 : ");
        System.out.println("original : " + original);
        System.out.println("copy2 : " + copy2);
        System.out.println();
    }
}
