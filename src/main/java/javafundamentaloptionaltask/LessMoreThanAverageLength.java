package javafundamentaloptionaltask;

import java.util.Scanner;

public class LessMoreThanAverageLength {
    public static void main(String[] args) {
        System.out.println("Enter the value of the number of elements in the array: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfElementsInArray = scanner.nextInt();
        int array[] = new int[numberOfElementsInArray];
        int numbers[] = new int[numberOfElementsInArray];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < numberOfElementsInArray; i++) {
            array[i] = scanner.nextInt();
            numbers[i] = (array[i] + "").length();
        }
        System.out.println();
        scanner.close();
        lessMoreThanAverageLength(array, numbers, numberOfElementsInArray);
    }

    // 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
    private static void lessMoreThanAverageLength(int[] array, int[] numbers, int numberOfElementsInArray) {
        float value = 0;
        for (int i = 0; i < numberOfElementsInArray; i++) {
            value = value + numbers[i];
        }
        value = value / numberOfElementsInArray;
        System.out.println("Average length of numbers is " + value + ";");
        System.out.println("Numbers whose length is less than average: ");
        for (int i = 0; i < numberOfElementsInArray; i++) {
            if (value > numbers[i]) {
                System.out.println("Number: " + array[i] + ". His length: " + numbers[i] + ";");
            }
        }
        System.out.println("Numbers whose length is more than average: ");
        for (int i = 0; i < numberOfElementsInArray; i++) {
            if (value < numbers[i]) {
                System.out.println("Number: " + array[i] + ". His length: " + numbers[i] + ";");
            }
        }
    }
}
