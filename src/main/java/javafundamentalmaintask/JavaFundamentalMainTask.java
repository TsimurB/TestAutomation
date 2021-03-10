package javafundamentalmaintask;

import java.util.Random;
import java.util.Scanner;

public class JavaFundamentalMainTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Приветсвовать любого пользователя при вводе его имени через командную строку.
        System.out.println("Type your name.");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");

        // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке
        String revers = new StringBuffer(name).reverse().toString();
        System.out.println("Аргументы командной строки в обратном порядке: " + revers);

        // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        System.out.println("Enter the number of random values: ");
        int a = scanner.nextInt();
        Random random = new Random(System.currentTimeMillis());
        for (int x = 0; x < a; x++) {
            int c = random.nextInt();
            System.out.print(c);
            System.out.print(" ");
            System.out.println(c);
        }

        // 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
        // и вывести результат на консоль.
        System.out.println("Enter two whole numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Sum of numbers = " + (number1 + number2));
        System.out.println("Product of numbers = " + (number1 * number2));

        // 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному чслу.
        // Осуществить проверку корректности ввода чисел.
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

