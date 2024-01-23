package Seminar_1.Task_0;

/** 
 * Реализуйте метод, принимающий в качестве аргумента
целочисленный массив.
 * Если длина массива меньше некоторого заданного минимума,
метод возвращает -1, в качестве кода ошибки, иначе - длину
массива.
*/

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int min = 10;
        System.out.println(getLength(arr, min));
    }

    public static int getLength (int[] array, int minLength) {
        if (array.length < minLength) return -1;
        return array.length;
    }
   
}