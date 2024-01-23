package Seminar_1.Task_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить”
 */

public class Program {
    public static void main(String[] args) {
        Integer[] array = {1, null, 5, null};
        checkArray(array);
    }

    public static void checkArray(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.add(i);
            }
        }
        if (result.size() > 0) throw new RuntimeException("В массиве присутствуют null на позициях: " + String.valueOf(result));
    }
}
