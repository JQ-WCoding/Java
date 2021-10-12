package chapter11.collections;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put( "JUN", 90 );
        hashMap.put( "JUN", 100 );
        // HashMap 중복 확인
        hashMap.put( "LEE", 90 );
        hashMap.put( "KIM", 100 );
        hashMap.put( "PARK", 100 );

        // Set 참조 변수로 컬랙션 hashMap 반환
        Set set = hashMap.entrySet();
        // Iterator 를 통해 읽어들이는 형태로 변경
        Iterator iterator = set.iterator();

        // Map.Entry 는 왜 쓰는거지?
        // Map.Entry 는 인터페이스 -? getValue()와 getKey()메소드를 사용할 수 있는 인터페이스이다.
        // Map.Entry 는 튜플 (쌍으로 이루어진 데이터)를 생성하기 위해 사용 -> key value 를 쌍으로 값을 저장하기 위함
        // 튜플 : 셀수있는 수량의 순서있는 열거 또는 어떤 순서를 따르는 요소들의 모음을 튜플(tuple)이라고 합니다
        Map.Entry e;
        while ( iterator.hasNext() ) {
            e = ( Map.Entry ) iterator.next();
            // key 와 value 값을 통해 해당 성적 인원 이름과 성적을 출력 getKey(), getValue()
            System.out.println( "Name : " + e.getKey() + ", Score : " + e.getValue() );
        }

        // keySet() 으로 Set 참조변수 형으로 초기화
        set = hashMap.keySet();
        // key 값만 존재하기에 이름만 출력
        // set 이기에 중복 제거 상태
        System.out.println( "Participants : " + set );

        // Collection 을 이용해 value 인 값 저장
        Collection values = hashMap.values();
        iterator = values.iterator();

        // 총점수 초기화
        int total = 0;
        // int 기본참조타입이 아닌 Integer 객체형태로 사용해야한다 -> collection 에 저장하기 위해
        Integer integer;
        while ( iterator.hasNext() ) {
            integer = ( Integer ) iterator.next();
            // 총점에 int 형으로 반환한 값을 계속 더해준다
            total += integer.intValue();
        }

        System.out.println( "Total : " + total );
        // float 형으로 형변환 하여 평균값을 구한다 소수점 출력을 위해
        System.out.println( "Avg : " + ( float ) total / set.size() );
        System.out.println( "Max : " + Collections.max( values ) );
        System.out.println( "Min : " + Collections.min( values ) );
    }
}
