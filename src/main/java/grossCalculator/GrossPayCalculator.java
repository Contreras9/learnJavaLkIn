package grossCalculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //1. Get the hourly pay rate
        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();

        scanner.close();

        //1. Multiply hours and pay rate
        double grossPay = payRate * hours;

        //1. Display result
        System.out.println("Gross pay: " + grossPay);
    }
}
