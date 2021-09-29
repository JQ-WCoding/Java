package chapter10.time;

import java.time.LocalDate;

public class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p(today);
        p(date);
//        p(today.with());
    }

    static void p(Object o) {
        System.out.println(o);
    }
}