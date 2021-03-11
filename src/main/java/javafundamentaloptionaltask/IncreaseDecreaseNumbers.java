package javafundamentaloptionaltask;

import java.util.Scanner;

public class IncreaseDecreaseNumbers {

    public static void main(String[] args) {
        System.out.println("Enter the value of the number of elements in the array: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfElementsInArray = scanner.nextInt();
        String[] array = new String[numberOfElementsInArray];
        int numbers[] = new int[numberOfElementsInArray];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < numberOfElementsInArray; i++) {
            array[i] = String.valueOf(scanner.nextInt());
            numbers[i] = (array[i] + "").length();
        }
        System.out.println();
        scanner.close();
        increaseDecreaseNumbers(array, numbers);
    }

    // 2. Вывести числа в порядке возрастания (убывания) значений их длины.
    private static void increaseDecreaseNumbers(String[] array, int[] numbers) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Min - Max length");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value of number " + array[i] + " - his length is " + numbers[i]);
        }
        System.out.println();
        System.out.println("Max - Min length");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Value of number " + array[i] + " - his length is " + numbers[i]);
        }
        System.out.println();
    }
}
