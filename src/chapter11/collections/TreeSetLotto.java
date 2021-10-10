package chapter11.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        int num;
        for ( int i = 0; set.size() < 6; i++ ) {
            // 랜던함 숫자 초기화
            num = ( int ) (Math.random() * 45) + 1;
            set.add( num );
        }
        // TreeSet 은 저장과 동시에 정렬을 함 -> 따로 sort() 정렬을 사용할 필요가 없다
        System.out.println( set );
    }
}
