package Seminar_1.Task_1;

import java.util.Scanner;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
значение и покажет читаемый результат пользователю. Например, если вернулся -2,
пользователю выведется сообщение: “Искомый элемент не найден”.
 */

public class Program {
    public static void main(String[] args) {
        int[] arr1 = {10, 3, 8, 4, 5};
        int[] arr2 = null;
        int[] arr3 = new int[2];
        int[] arr4 = {5, 15, 1, 3, 87};
        int min = 5;
        System.out.println("Введите значение элемента: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        getArrayElementMessage(arr1, min, num);
        getArrayElementMessage(arr2, min, num);
        getArrayElementMessage(arr3, min, num);
        getArrayElementMessage(arr4, min, num);
        scanner.close();
    }

    public static int getArrayElement (int[] array, int minLength, int element) {
        if (array == null) return -3;
        if (array.length < minLength) return -1;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -2;
    }

    public static void getArrayElementMessage(int[] array, int minLength, int element) {
        if (getArrayElement(array, minLength, element) == -1) System.out.printf("Длина массива меньше минимального значения %d!\n", minLength);
        else if (getArrayElement(array, minLength, element) == -2) System.out.println("Искомый элемент не найден!");
        else if (getArrayElement(array, minLength, element) == -3) System.out.println("Вместо массива пришел null!");
        else System.out.printf("Индекс искомого элемента: %d\n", getArrayElement(array, minLength, element));
    }
}
