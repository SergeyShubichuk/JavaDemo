package homework2;

import java.util.Scanner;

public class Homework_star {

    /*
    Напишите программу, где пользователь вводит любое целое положительное число, а программа суммирует все числа
    от 1 до введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
    пользователь не мог ввести некорректные данные.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число - ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("введите положительное число");
            } else {
                int sum = 0;
                for (int i = 1; i <= a; i++) {
                    sum = sum + i;
                }
                System.out.println(sum);
                scanner.close();
            }
        } else {
            System.out.println("Введите корректные данные");
        }
    }
}
