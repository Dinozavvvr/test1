package ru.madbrains.lesson1;

import java.util.Scanner;

public class SquarePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Это приложение для печати квадратов");
        while (true) {
            System.out.println("Введите print чтобы нарисовать квадрат и stop чтобы выйти");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equals("stop")) {
                break;
            } else if (inputCommand.equals("print")) {
                System.out.println("Квадрат NxN");
            } else {
                System.out.println("Неверная команда, повторите снова!");
            }
        }

        System.out.println("Спасибо за использование, досвидания!");
    }

}
