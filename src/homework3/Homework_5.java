package homework3;

/*
Пользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива задан, заполнить
его используя Math.random(). После заполнения массива данными, решить для него следующие задачи:
- Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.
 */

import java.util.Scanner;

public class Homework_5 {

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
        System.out.print("Массив : ");

        System.out.print(" ");

        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");

        }

        for (int i = 0; i < size / 2; i++) {
            int temp = mass[i];
            mass[i] = mass[size - i - 1];
            mass[size - i - 1] = temp;
        }
        System.out.println(" ");

        System.out.print("Полученный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");

        }

    }

}
