package chapter9.langPackage;

public class StringEx7 {
    public static void main(String[] args) {
        String title = "SpringEx.java";

        // '.'의 위치 (순번)을 찾아 int 형으로 반환
        int index = title.indexOf('.');

        // file 명은 title 변수의 0번째(시작) 인덱스 부터 '.'의 순번을 찾았던 index 변수미만(바로전) 까지의 값을 반환한다
        String file = title.substring(0, index);

        // 두가지의 결과는 동일하다 -> 해당 문자열의 끝까지 표현을 원한다면 두번째 인자값은 입력하지 않아도 상관없다
        String fileEx1 = title.substring(index + 1);
        String fileEx2 = title.substring(index + 1, title.length());
        // int endIndex 를 매개변수로 받음

        System.out.println(title + "의 확장자 제외명 : " + file);
        System.out.println(title + "의 확장자 : " + fileEx1);
    }
}
