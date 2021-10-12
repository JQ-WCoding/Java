package chapter11.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
            // Map.Entry 참조변수로 만들고
            Map.Entry e1 = (Map.Entry) o1;
            Map.Entry e2 = (Map.Entry) o2;

            // e1 e2의 value 값을 int 형으로 변환한 값 두개의 차를 구해 반환
            int value1 = ((Integer) e1.getValue()).intValue();
            int value2 = ((Integer) e2.getValue()).intValue();

            return value2 - value1;
        }
        // 비교할 수 없으면 -1을 반환
        return -1;
    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        Arrays.fill(bar, ch);

        return new String(bar);
    }
}
