package ru.madbrains.lesson1;

import java.util.Scanner;

public class SquarePrinterAndrey {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Привет! Это программа для рисования квадрата");

        System.out.println("Это приложение для печати квадратов");
        while (true) {
            System.out.println("Введите print чтобы нарисовать квадрат и stop чтобы выйти");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equals("stop")) {
                break;
            } else if (inputCommand.equals("print")) {
                printSquare(scanner);
            } else {
                System.out.println("Неверная команда, повторите снова!");
            }
        }
    }

    public static void printSquare(Scanner scanner) {
        System.out.println("Чтобы нарисовать квадрат, введите внешний размер квадрата");

        int numberA = readOuterSquareWidth(scanner);
        int numberB = readInnerSquareWidth(scanner, numberA);

        //Иницилизируем массив и заполняем его полностью символами *.
        String[][] square = new String[numberA][numberA];
        for (int i = 0; i < numberA; i++) {
            for (int j = 0; j < numberA; j++) {
                square[i][j] = "* ";
            }
        }

        // определим начальные координаты внутреннего квадрата в массиве
        int numberX = (numberA - numberB) / 2;


        //вводим в массив символы " " по размеру внутреннего квадрата
        for (int i = numberX; i < (numberB + numberX); i++) {
            for (int j = numberX; j < (numberB + numberX); j++) {
                square[i][j] = "  ";
            }
        }

        //Выводим в консоль все элементы массива
        for (int i = 0; i < numberA; i++) {
            for (int j = 0; j < numberA; j++) {
                System.out.print(square[i][j]);
            }
            System.out.println();

        }
    }

    private static int readInnerSquareWidth(Scanner scanner, int numberA) {
        System.out.println("Теперь введите размер внутреннего квадрата");
        int numberB = scanner.nextInt();

        while (isNotValidInnerSquareWidth(numberA, numberB)) {
            System.out.println(
                    "Ошибка. Число должно быть положительным и должно быть меньше "
                    + "внешнего размера квадрата как минимум на 2 значения. Введите  "
                    + "размер внутреннего квадрата заново");
            numberB = scanner.nextInt();
        }

        return numberB;
    }

    private static boolean isNotValidInnerSquareWidth(int numberA, int numberB) {
        return (numberB < 0) || (numberA - numberB) % 2 == 1;
    }

    private static int readOuterSquareWidth(Scanner scanner) {
        int numberA = scanner.nextInt();

        // Проверяем, чтобы число было положительным.
        while (numberA < 0) {
            System.out.println(
                    "Ошибка. Число должно быть положительным. Введите размер квадрата заново");
            numberA = scanner.nextInt();
        }

        return numberA;
    }

}