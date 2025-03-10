package homework3;

/*
Пользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива задан, заполнить
его используя Math.random(). После заполнения массива данными, решить для него следующие задачи:
- Найти минимальный - максимальный элементы и вывести в консоль.
 */

import java.util.Scanner;

public class Homework_2 {

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
        //Ищем минимальное значение
        int min = mass[0];
        for (int i = 1; i < size; i++) {
            if (mass[i] < min)
                min = mass[i];
        }
        System.out.print("Минимальное значение: = " + min);

        System.out.println(" ");

        int max = mass[0];
        for (int i = 1; i < size; i++) {
            if (mass[i] > max)
                max = mass[i];
        }
        System.out.print("Максимальное значение: = " + max);

        scanner.close();

    }

}
