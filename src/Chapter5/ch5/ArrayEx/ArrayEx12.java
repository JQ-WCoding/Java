package Chapter5.ch5.ArrayEx;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "Park"};

        for (String i : names) {
            System.out.println(i);
        }

        String temp = names[2];
        System.out.println("temp : " + temp);

        names[0] = "Pak";

        for (String i : names) {
            System.out.println(i);
        }
    }
}
