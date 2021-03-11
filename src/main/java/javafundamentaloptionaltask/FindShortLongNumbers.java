package javafundamentaloptionaltask;

import java.util.Scanner;

public class FindShortLongNumbers {
    public static void main(String[] args) {
        // Ввести n чисел с консоли.
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
//        increaseDecreaseNumbers(array, numbers);
//        lessMoreThanAverageLength(array, numbers, numberOfElementsInArray);
//        increasingNumbers(array, numbers, numberOfElementsInArray);
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

//    // 2. Вывести числа в порядке возрастания (убывания) значений их длины.
//  private static void increaseDecreaseNumbers(String[] array, int[] numbers) {
//        произведем сортировку пузырьком
//        for (int i = array.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[j].length() > array[j + 1].length()) {
//                    String tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                }
//            }
//        }
//        System.out.println("Min - Max length");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Value of number " + array[i] + " - his length is " + numbers[i]);
//        }
//        System.out.println();
//        System.out.println("Max - Min length");
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println("Value of number " + array[i] + " - his length is " + numbers[i]);
//        }
//        System.out.println();
//    }


    // 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
//    private static void lessMoreThanAverageLength(int[] array, int[] numbers, int numberOfElementsInArray) {
//        float value = 0;
//        for (int i = 0; i < numberOfElementsInArray; i++) {
//            value = value + numbers[i];
//        }
//        value = value / numberOfElementsInArray;
//        System.out.println("Average length of numbers is " + value + ";");
//        System.out.println("Numbers whose length is less than average: ");
//        for (int i = 0; i < numberOfElementsInArray; i++) {
//            if (value > numbers[i]) {
//                System.out.println("Number: " + array[i] + ". His length: " + numbers[i] + ";");
//            }
//        }
//        System.out.println("Numbers whose length is more than average: ");
//        for (int i = 0; i < numberOfElementsInArray; i++) {
//            if (value < numbers[i]) {
//                System.out.println("Number: " + array[i] + ". His length: " + numbers[i] + ";");
//            }
//        }
//    }

    // 6. Найти число, цифры в котором идут в строгом порядке возрастания.
    // Если таких чисел несколько, найти первое из них.
//    private static void increasingNumbers(int[] array, int[] numbers, int numberOfElementsInArray) {
//        int p;
//        boolean b;
//        for (int i = 0; i < numberOfElementsInArray; i++) {
//            int k = 0;
//            b = false;
//            int[] newArray = new int[numbers[i]];
//            p = array[i];
//            while (p != 0) {
//                newArray[k] = p % 10;
//                p = p / 10;
//                if (newArray[k] > p % 10) {
//                    b = true;
//                } else {
//                    b = false;
//                    break;
//                }
//                k++;
//            }
//            if (b == true) {
//                System.out.println("The number are in increasing order: " + array[i] + ";");
//                System.out.println();
//                break;
//            } else {
//                System.out.println("Numbers in increasing order not found;");
//                System.out.println();
//            }
//        }
//    }
}
