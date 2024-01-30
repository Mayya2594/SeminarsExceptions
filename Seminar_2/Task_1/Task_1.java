package Seminar_2.Task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt();
        // try {
        //     arr[index] = 1;
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println("Указан индекс за пределами массива");
        // }
        if (index < arr.length) {
            arr[index] = 1;
        } else {
            System.out.println("Указан индекс за пределами массива");
        }
        scanner.close();
    }
}
