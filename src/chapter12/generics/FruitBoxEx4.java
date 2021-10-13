package chapter12.generics;

import java.util.Collections;

public class FruitBoxEx4 {
    public static void main(String[] args) {
        NewFruitBox<NewApple> appleBox = new NewFruitBox<>();
        NewFruitBox<NewGrape> grapeBox = new NewFruitBox<>();

        // 정렬을 위해 순차가 다르게 값 입력하기 -> 내림차순 오름차순이외 마구잡이로 값 입력
        appleBox.add(new NewApple("GreenApple", 200));
        appleBox.add(new NewApple("GreenApple", 100));
        appleBox.add(new NewApple("GreenApple", 300));

        grapeBox.add(new NewGrape("BlueGrape", 200));
        grapeBox.add(new NewGrape("BlueGrape", 400));
        grapeBox.add(new NewGrape("BlueGrape", 300));

        // 정렬기준이 AppleComp
        // Collections.sort(List<T> list, Comparator<? super T> c)
        //  public static <T> void sort(List<T> list, Comparator<? super T> c) -> <? super T> 이기 때문에 <? super Apple> -> Apple 의 부모클래스도 가능함을 표현
        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();

        // Collections 정렬 appleBox 와 grapeBox 를 각각 정렬한다
        // 첫전째 인자값으로 정렬할 list 를 던져주고 두번째 인자값으로 정렬할 기준?방법을 넘겨 정렬한다
        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
