package homework3;

/*
Пользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива задан, заполнить
его используя Math.random(). После заполнения массива данными, решить для него следующие задачи:
Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего).
 */

import java.util.Scanner;

public class Homework_6 {

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

        int k = 0;
        if (k == 0) {
            for (int i = 0; i < size - 1; i++) {
                if (mass[i] >= mass[i + 1])
                    k++;
            }
        }

        if (k == 0) System.out.println("Последовательность возрастающая");
        else System.out.println("Последовательность НЕ возрастающая");
    }
}
