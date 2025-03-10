package homework3;

/*
Пользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива задан, заполнить
его используя Math.random(). После заполнения массива данными, решить для него следующие задачи:
- Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
 */

import java.util.Scanner;

public class Homework_1 {

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
        System.out.print("Массив в прямом порядке: ");
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Массив в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        scanner.close();

    }

}
