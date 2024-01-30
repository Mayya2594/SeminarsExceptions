package Seminar_2.HW_2.HW_Task_3;

class Expr {

    public static double expr(int a, int b) {
 // Введите свое решение ниже
        printSum(a, b);     
        if (b == 0) {
            return b;
        } else {
            return (double) a / b;
        }
}

    public static void printSum(int a, int b) {
 // Введите свое решение ниже
        System.out.println(a + b);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 5; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } 

        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}