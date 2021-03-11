package javafundamentaloptionaltask;

import java.util.Scanner;

public class IncreasingNumbers {
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
        increasingNumbers(array, numbers, numberOfElementsInArray);
    }

    // 6. Найти число, цифры в котором идут в строгом порядке возрастания.
    // Если таких чисел несколько, найти первое из них.
    private static void increasingNumbers(int[] array, int[] numbers, int numberOfElementsInArray) {
        int p;
        boolean b;
        for (int i = 0; i < numberOfElementsInArray; i++) {
            int k = 0;
            b = false;
            int[] newArray = new int[numbers[i]];
            p = array[i];
            while (p != 0) {
                newArray[k] = p % 10;
                p = p / 10;
                if (newArray[k] > p % 10) {
                    b = true;
                } else {
                    b = false;
                    break;
                }
                k++;
            }
            if (b == true) {
                System.out.println("The number are in increasing order: " + array[i] + ";");
                System.out.println();
                break;
            } else {
                System.out.println("Numbers in increasing order not found;");
                System.out.println();
            }
        }
    }
}
