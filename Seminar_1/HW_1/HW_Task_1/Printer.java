package Seminar_1.HW_1.HW_Task_1;

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[5];
        System.out.println(arr[6]);
    }

    public static void divisionByZero() {
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }

    public static void numberFormatException() {
        String a = "abc123";
        System.out.println(Integer.parseInt(a));   
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
