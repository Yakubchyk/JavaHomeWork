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
class Array_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь сам должен выбрать длинну массива: ");
        int userMeind = scanner.nextInt();
        int[] arrRandom = new Math.random() * userMeind;
    }
}

    }
}

/*
Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль.
 */
