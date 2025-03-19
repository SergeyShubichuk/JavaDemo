package homework3;

/*
Пользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива задан, каждый
элемент массива вводится пользователем вручную. После заполнения массива данными, решить для него следующие задачи:
- Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
 */

import java.util.Scanner;

public class Homework_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //запрашиваем размер мессива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        //Создаем массив указанного размера
        int[] mass = new int[size];

        //Заполняем массив вручную
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива " + (i + 1) + ": ");
            mass[i] = scanner.nextInt();
        }
        // Выводим массив в консоль
        System.out.print("Заполненный массив массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        int qty = 0;
        for (int i = 0; i < size; i++) {
            if (mass[i] == 0) {
                qty++;
            }
        }
        if (qty > 0)
            System.out.println("Количество нулевых элементов: " + qty);
        else System.out.println("Нулевых элементов нет");

        scanner.close();

    }

}
