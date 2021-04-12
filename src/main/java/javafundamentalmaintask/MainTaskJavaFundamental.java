package javafundamentalmaintask;

import java.util.Random;
import java.util.Scanner;

public class MainTaskJavaFundamental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name.");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");

        String revers = new StringBuffer(name).reverse().toString();
        System.out.println("Аргументы командной строки в обратном порядке: " + revers);

        System.out.println("Enter the number of random values: ");
        int numberOfRandomValues = scanner.nextInt();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < numberOfRandomValues; i++) {
            int randomValue = random.nextInt();
            System.out.print(randomValue);
            System.out.print(" ");
            System.out.println(randomValue);
        }

        System.out.println("Enter two whole numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Sum of numbers = " + (number1 + number2));
        System.out.println("Product of numbers = " + (number1 * number2));

        System.out.println("Enter the number from 1 to 12: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 13) {
            String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                    "October", "November", "December"};
            int monthValue = monthNumber - 1;
            System.out.println("Month is " + month[monthValue]);
        } else {
            System.out.println("There are 12 month in the year.");
        }
    }

}

