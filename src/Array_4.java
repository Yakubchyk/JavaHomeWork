import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_4 {
    /*
        Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество элементов массива: ");
// тут пользователь сам ввозит элементы массива
        int[] arrUser = new int[scanner.nextInt()];
        for (int i = 0; i < arrUser.length; i++) {
            arrUser[i] = scanner.nextInt();
        }
        System.out.print("Содердивое массива:   ");
        for (int ligen : arrUser) {
            System.out.print(ligen + " ");
        }
        int temp = 0;
        int l = arrUser.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arrUser[i] > arrUser[j]) {
                    temp = arrUser[i];
                    arrUser[i] = arrUser[j];
                    arrUser[j] = temp;
                }
            }
        }
//  вывожим отсортированный массив на жкран
        System.out.println(" ");
        System.out.print("Сортировка по возрастанию: ");
        for (int i = 0; i < arrUser.length; i++) {
            System.out.print(arrUser[i] + " ");
        }

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
        System.out.println("Числа выбраны и внесены рандомно в деапазоне от 0 до 100");

        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] += random.nextInt(100);
        }

        for (int link : arrRandom) {
            System.out.print(link + " ");
        }
// сравниваем на предмет нахождения минимума и максимума в массиве
        // поиск минимума
        int min = arrRandom[0];
        for (int i = 1; i < arrRandom.length; i++) {
            if (arrRandom[i] < min) {
                min = arrRandom[i];
            }
        }
        System.out.println(" ");
        System.out.println("Минимальное значение в массиве равно " + min);

        // поиск максимального значение массива
        int max = arrRandom[0];
        for (int i = 1; i < arrRandom.length; i++) {
            if (arrRandom[i] > max) {
                max = arrRandom[i];
            }
        }
        System.out.println("Максимальное значение в массиве равно " + max);
    }
}