package games;

import java.util.Scanner;

public class FillInTheBlanks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's create a story!!!");

        System.out.println("Enter a adjective");
        String adj = scanner.next();

        System.out.println("Enter a season of the year");
        String season = scanner.next();

        System.out.println("Enter a whole number");
        int num = scanner.nextInt();

        scanner.close();

        System.out.println("On a " + adj + " " + season + " day, " + "I drink a minimum of " + num +" cups of coffee.");

    }
}
