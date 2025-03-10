package homework3;

/*
ДПользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива задан, заполнить
его используя Math.random(). После заполнения массива данными, решить для него следующие задачи:
- Найти индексы минимального и максимального элементов и вывести в консоль.
 */

import java.util.Scanner;

public class Homework_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //запрашиваем размер мессива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        //Создаем массив указанного размера
        int[] mass = new int[size];

        //Заполняем массив случайными числами
        for (int i = 0; i < size; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        //Выводим результат в консоль
        System.out.println("Массив : ");
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");

        int min = mass[0];
        int index_min = 0;
        for (int i = 1; i < size; i++) {
            if (mass[i] < min) {
                min = mass[i];
                index_min = i;
            }
        }
        System.out.print("Индекс минимального значения: = " + index_min);

        System.out.println(" ");

        int max = mass[0];
        int index_max = 0;
        for (int i = 1; i < size; i++) {
            if (mass[i] > max) {
                max = mass[i];
                index_max = i;
            }
        }
        System.out.print("Индекс максимального значения: = " + index_max);

        scanner.close();

    }

}
