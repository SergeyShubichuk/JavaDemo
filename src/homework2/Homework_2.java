package homework2;

import java.util.Scanner;

/*
Для введенного числа t (температура на улице) вывести:
Если t>–5, то вывести - «Warm».
Если –5 >= t >–20, то вывести «Normal».
Если –20 >= t, то вывести «Cold».
 */

public class Homework_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите показания градусника - ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm :)");
        } else if (t > -20) {
            System.out.println("Normal :)");
        } else  {
            System.out.println("Cold :)");
        }
        scanner.close();
    }
}
