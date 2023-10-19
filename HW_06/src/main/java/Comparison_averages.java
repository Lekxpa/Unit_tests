//Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
//        a. Рассчитывает среднее значение каждого списка.
//        b. Сравнивает эти средние значения и выводит соответствующее сообщение:
//        - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
//        - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
//        - ""Средние значения равны"", если средние значения списков равны.

import java.util.ArrayList;
import java.util.List;

public class Comparison_averages {
    public static String averageValueOfArray(int[] array1, int[] array2) {
        int sumArray1 = 0;
        int sumArray2 = 0;
        float avgArray1;
        float avgArray2;

        for (int i : array1) {
            sumArray1 += i;
        }

        for (int i : array2) {
            sumArray2 += i;
        }

        avgArray1 = (float) sumArray1 / array1.length;
        avgArray2 = (float) sumArray2 / array2.length;
        if (avgArray1 > avgArray2 || array2.length == 0) {
            return "Первый список имеет большее среднее значение";
        } else if (avgArray1 < avgArray2 || array1.length == 0) {
            return "Второй список имеет большее среднее значение";
        } else{
            return "Средние значения равны";
        }
    }
}
