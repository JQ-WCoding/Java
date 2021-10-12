package chapter11.collections;

import java.util.*;

public class TreeMapEx1 {
    public static void main(String[] args) {
        String[] data = {"A", "B", "A", "A", "A", "B", "B", "C", "C", "C", "C", "C", "C", "C"};

        TreeMap treeMap = new TreeMap();

        Integer value;
        for (int i = 0; i < data.length; i++) {
            if (treeMap.containsKey(data[i])) {
                value = (Integer) treeMap.get(data[i]);
                treeMap.put(data[i], new Integer(value.intValue() + 1));
            } else {
                treeMap.put(data[i], new Integer(1));
            }
        }

        Iterator iterator = treeMap.entrySet().iterator();

        System.out.println("Normal Sort");

        Map.Entry entry;
        int values;

        while (iterator.hasNext()) {
            entry = (Map.Entry) iterator.next();
            values = ((Integer) entry.getValue()).intValue();
            // ValueComparator 클래스에 printBar() 메소드 정의
            System.out.println(entry.getKey() + " : " + ValueComparator.printBar('#', values) + " " + values);
        }
        System.out.println();

        Set set = treeMap.entrySet();
        List list = new ArrayList(set);

        // Collections 클래스의 sort 정렬 사용 -> list 를 정열
        Collections.sort(list, new ValueComparator());

        iterator = list.iterator();
        System.out.println("Sort -> ascending");

        // 이미 선언한 변수 그대로 사용
        while (iterator.hasNext()) {
            entry = (Map.Entry) iterator.next();
            values = ((Integer) entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + ValueComparator.printBar('#', values) + " " + values);
        }
    }
}
