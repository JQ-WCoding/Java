package chapter11.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx4 {
    public static void main(String[] args) {
        String[] data = {"A", "E", "C", "C", "E", "E", "A", "E", "A", "A", "A", "A"};

        HashMap hashMap = new HashMap();

        Integer value;
        for (int i = 0; i < data.length; i++) {
            // hashMap 변수에 data[i] 의 값이 이미 존재한다면
            if (hashMap.containsKey(data[i])) {
                // value Integer 객체에 해당 값을 형변환하여 저장한다 (숫자로) -> value 값을 확인하고 숫자를 1씩 증가시켜주기 위해
                value = (Integer) hashMap.get(data[i]);
                // put() 을 통해 해당 값
                hashMap.put(data[i], new Integer(value.intValue() + 1));
            } else {
                // 처음이라면 1로 설정
                hashMap.put(data[i], new Integer(1));
            }
        }

        // chain 형식
        Iterator iterator = hashMap.entrySet().iterator();

        Map.Entry entry;
        int values;
        while (iterator.hasNext()) {
            // entry 값에
            entry = (Map.Entry) iterator.next();
            values = ((Integer) entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + ValueComparator.printBar('#', values) + " " + values);
        }
    }

    static String printBar(char ch, int value) {
        char[] bar = new char[value];

        // 배열 속성 값 순차적으로 전부 추가하기
        Arrays.fill(bar, ch);

        // value 값만큼 ch를 생성하고 String 으로 해당 값을 인스턴스화하여 반환
        return new String(bar);
    }
}
