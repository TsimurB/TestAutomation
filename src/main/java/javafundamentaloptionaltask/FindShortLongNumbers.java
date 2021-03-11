package javafundamentaloptionaltask;

import java.util.Scanner;

public class FindShortLongNumbers {
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
        findShortLongNumbers(array, numbers, numberOfElementsInArray);
    }

    // 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длинну.
    private static void findShortLongNumbers(int[] array, int[] numbers, int numberOfElementsInArray) {
        int max = numbers[0];
        int min = numbers[0];
        int longlength = 0;
        int shortLength = 0;
        for (int i = 1; i < numberOfElementsInArray; i++) {
            int j = numbers[i];
            if (min > j) {
                min = j;
                shortLength = i;
            } else {
                if (max < j) {
                    max = j;
                    longlength = i;
                }
            }
        }
        System.out.println("The shortest number is " + array[shortLength] + ". His length is " + min + ";");
        System.out.println("The longest number is " + array[longlength] + ". His length is " + max + ";");
        System.out.println();
    }
}
