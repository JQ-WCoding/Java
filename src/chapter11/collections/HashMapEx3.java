package chapter11.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
    // 전화번호부
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("Friend", "Lee", "010-1234-5678");
        addPhoneNo("Friend", "James", "010-2345-1234");
        // 전화번호가 같으면 중복처리
        addPhoneNo("Friend", "Kim", "010-1234-5678"); // 첫번째 Lee 로 입력했지만 마지막에 중복된 값으로 변경되어 초기화된 Kim 이 출력
        addPhoneNo("Company", "Michael", "010-3425-1245");
        addPhoneNo("Company", "Tom", "010-3512-8987");
        addPhoneNo("Company", "Jane", "010-8674-3456");
        addPhoneNo("Laundry", "02-124-1234");

        printList();
    }

    static void addPhoneNo(String groupName, String name, String tel) {
        // 그룹 이름은 addGroup() 메소드를 호출하여 사용
        addGroup(groupName);
        // HashMap 형 group 변수에 해당 그룹 이름이 있으면 가져오도록 한다
        HashMap group = (HashMap) phoneBook.get(groupName);
        // 해당 HashMap 에 전화번호와 이름을 저장한다 -> 첫번째 인자값이 key 값이고 두번째 인자값이 value 값이다
        group.put(tel, name);
    }

    static void addGroup(String groupName) {
        // 그룹명을 phoneBook 이 가지고 있지 않다면
        if (!phoneBook.containsKey(groupName)) {
            // 새로운 그룹명을 사용해서 value 에 또다른 HashMap 을 저장한다
            phoneBook.put(groupName, new HashMap<>());
        }
    }

    // 기본
    static void addPhoneNo(String name, String tel) {
        addPhoneNo("ETC", name, tel);
    }

    static void printList() {
        // hashmap 에서 set 으로 변경
        Set set = phoneBook.entrySet();
        Iterator iterator = set.iterator();

        // 반복문 내에서 사용할 변수들
        Map.Entry e;
        Map.Entry subE;
        Set subSet;
        Iterator subIt;
        String telNo;
        String name;
        // iterator 에 다음 값이 있다면 계속 반복문 실행
        while (iterator.hasNext()) {
            e = (Map.Entry) iterator.next();
            subSet = ((HashMap) e.getValue()).entrySet();
            subIt = subSet.iterator();
            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
            while (subIt.hasNext()) {
                subE = (Map.Entry) subIt.next();
                // key 값이 전화번호 value 값이 이름
                telNo = (String) subE.getKey();
                name = (String) subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }
}
