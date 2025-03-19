package homework3;

/*
Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:
 */

import java.util.Scanner;

public class Homework_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //запрашиваем размер мессива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        //Создаем массив указанного размера
        int[] mass = new int[size];

        //Заполняем массив вручную
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            mass[i] = scanner.nextInt();
        }
        // Выводим массив в консоль
            System.out.print("Заполненный массив: ");
            for (int i = 0; i < size; i++) {
                System.out.print(mass[i] + " ");
        }
        scanner.close();

    }

}
