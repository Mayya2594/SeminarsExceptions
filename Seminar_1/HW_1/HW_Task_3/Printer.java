package Seminar_1.HW_1.HW_Task_3;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
      // Введите свое решение ниже
        int[] c = {0};
        int[] d = new int[a.length];
        if (a.length != b.length) return c;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 0) throw new RuntimeException("Деление на ноль запрещено!");
        }
        for (int i = 0; i < d.length; i++) {
            d[i] = a[i] / b[i];
        }
        return d;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] a = {};
      int[] b = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{12, 8, 16, 0};
        b = new int[]{4, 2, 4};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }     
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.divArrays(a, b));     
      System.out.println(itresume_res);
    }
}