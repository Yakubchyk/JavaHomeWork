import java.util.Random;
import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество элементов массива: ");

        int[] arrUser = new int[scanner.nextInt()];
        for (int i = 0; i < arrUser.length; i++) {
            arrUser[i] = scanner.nextInt();
        }
        System.out.print("Содердивое массива:   ");
        for (int ligen : arrUser) {
            System.out.print(ligen + " ");
        }
        /*
        Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
         */


    }
}

/*
Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль.
 */
class Array_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Пользователь сам должен выбрать длинну массива: ");
        int userMeind = scanner.nextInt();
        int[] arrRandom = new int[userMeind];
        System.out.println("Наш массив длинной " + userMeind + " ячеек.");
        System.out.println("Числа будут внесены рандомно в деапазоне от 0 до 100");

        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] += random.nextInt(100);
        }

        for (int link : arrRandom) {
            System.out.print(link + " ");
        }
    }
}