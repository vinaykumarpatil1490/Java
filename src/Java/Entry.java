package Java;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("Eligible for vote");

        }
    }
}
