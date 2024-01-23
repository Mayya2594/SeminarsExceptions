package Seminar_1.Task_2;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
ошибке.
 */

public class Program {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 0, 1},
                        {1, 0, 1},
                        {1, 0, 1}};
        // int[][] arr2 = {{1, 0, 1},
        //                 {1, 0, 1},
        //                 {1, 0, 1},
        //                 {1, 0, 1}};
        int[][] arr3 = {{1, 0, 1},
                        {1, 0, 5},
                        {1, 0, 1}};                                
        System.out.println(getSumELement(arr1));
        // System.out.println(getSumELement(arr2));
        System.out.println(getSumELement(arr3));
    }

    public static int getSumELement(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) throw new RuntimeException("Ошибка! Количество строк массива не равно количеству столбцов!");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) throw new RuntimeException("Ошибка! Элемеенты массива должны быть равны 0 или 1!");
                sum += array[i][j];
            }
        }
        return sum;
    }
}
