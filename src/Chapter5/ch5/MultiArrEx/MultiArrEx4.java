package Chapter5.ch5.MultiArrEx;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"Desk", "책상"},
                {"Laptop", "노트북"},
                {"float", "실수"}
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻?", i + 1, words[i][0]);

            String temp = scanner.nextLine();

            if (temp.equals(words[i][1])) {
                System.out.println("Correct");
            } else {
                System.out.printf("Wrong, the answer : %s%n", words[i][1]);
            }
        }
    }
}
