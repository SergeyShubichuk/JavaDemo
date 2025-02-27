package homework2;

import java.util.Scanner;

public class Homework_1 {

    /*
    Напишите программу, которая будет принимать на вход число из консоли и на
    выход будет выводить сообщение четное число или нет. Для определения
    четности числа используйте операцию получения остатка от деления (операция
    выглядит так: '% 2').
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int b = a % 2;
        if (b <= 0) {
            System.out.println("Ввденное число: " + a + " - четное.");
        } else {
            System.out.println("Ввденное число: " + a + " - нечетное.");
        }
        scanner.close();
    }
}
