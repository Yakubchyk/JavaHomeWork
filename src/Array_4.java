/*
Тут находится вся домашка по массивам.
В том числе и со звездочкой.
 */

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
        System.out.println("Заполните массив: ");
        for (int i = 0; i < arrUser.length; i++) {
            arrUser[i] = scanner.nextInt();
        }
        System.out.print("Содердивое массива:   ");
        for (int ligen : arrUser) {
            System.out.print(ligen + " ");
        }

        // сортировка по возрастанию
        int temp = 0;
        int l = arrUser.length;
        int[] arrPos = arrUser;

        // я добавлю сюда проверку для задачи №6
        /*
        Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое следующее
число больше предыдущего).
         */
        int t = arrPos[0];
        boolean bul = true;
        for (int i = 1; i < arrUser.length; i++) {
            if (t > arrPos[i]) {
                bul = false;
                System.out.println("  массив не является возрастающей последовательностью.");
                break;
            }
        }
        if (bul == true) {
            System.out.println("  массив является возрастающей последовательностью.");
        }

        // сортировка массива
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arrUser[i] > arrUser[j]) {
                    temp = arrUser[i];
                    arrUser[i] = arrUser[j];
                    arrUser[j] = temp;
                }
            }
        }
//  вывожим отсортированный массив на экран
        System.out.println(" ");
        System.out.print("Сортировка по возрастанию: ");
        for (int i = 0; i < arrUser.length; i++) {
            System.out.print(arrUser[i] + " ");
        }
// сортировка по убыванию
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arrUser[i] < arrUser[j]) {
                    temp = arrUser[i];
                    arrUser[i] = arrUser[j];
                    arrUser[j] = temp;
                }
            }
        }

        System.out.println(" ");
        System.out.print("Сортировка по убыванию: ");
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
        // поиск минимума максимума
        int min = arrRandom[0];
        int max = arrRandom[0];
        int minIndex = 0;       // Эти 2 переменные нужны для
        int maxIndex = 0;       // решения следующей задачи.
        int zeroElement = 0;    // переменная нужна для решения задави 4.

        // Я добавлю в эти циклы проверку на содержанее нулевых элементов в массиве.
        // Это задание 4.
        //
        /*
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
сообщение, что их нет.
 */
        for (int i = 1; i < arrRandom.length; i++) {
            if (arrRandom[i] < min) {
                min = arrRandom[i];
            }
            if (min == 0) {
                zeroElement += 1;
            }
        }
        for (int i = 1; i < arrRandom.length; i++) {
            if (arrRandom[i] > max) {
                max = arrRandom[i];
            }
        }

        System.out.println(" ");
        System.out.println("Минимальное значение в массиве равно " + min);
        System.out.println("Максимальное значение в массиве равно " + max);

        // выведение на экран ответа по задаче 4.
        if (zeroElement > 0) {
            System.out.println("Колличество нулевых элементов в массиве: " + zeroElement);
        } else {
            System.out.println("Нулевых элементов в массиве нет.");
        }

        /*
        Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
Я выполню эту задачу в рамках упражнения 2.
//нам нужно найти индексы до того как этот массив будет отсортирован.
         */
        for (int i = 1; i < arrRandom.length; i++) {
            if (arrRandom[i] < arrRandom[minIndex]) {
                minIndex = i; // Обновляем индекс минимума
            }
            if (arrRandom[i] > arrRandom[maxIndex]) {
                maxIndex = i; // Обновляем индекс максимума
            }
        }
        System.out.println("Индекс максимального значения в массиве: " + maxIndex);
        System.out.println("Индекс минимального значения в массиве: " + minIndex);

    }
}


class Array_6 {
    public static void main(String[] args) {
        // рандомно выбираются числа для заполнения массива в диапазоне от 0 до 100;
        // пользователь выбирает лишь длинну массива
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Пользователь сам должен выбрать длинну массива: ");
        int userArr = scanner.nextInt();
        int[] arrRandom = new int[userArr];
        System.out.println("Наш массив длинной " + userArr + " ячеек.");
        System.out.println("Числа выбраны и внесены рандомно в деапазоне от 0 до 100");

        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] += random.nextInt(100);
        }

        for (int link : arrRandom) {
            System.out.print(link + " ");
        }
        // цикл проходит о массиву до его середины
        for (int i = 0; i < arrRandom.length / 2; i++) {
            // меняем местами элементы
            int temp = arrRandom[i];
            arrRandom[i] = arrRandom[arrRandom.length - i - 1];
            arrRandom[arrRandom.length - i - 1] = temp;
        }

        // вывод резльтатов посде замены.
        System.out.println(" ");
        System.out.println("Массив после замены:");
        for (int num : arrRandom) {
            System.out.print(num + " ");
        }
    }
}


/*
Задача *:
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
содержит нуля в начале, кроме самого числа 0.
 */
class Array_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество элементов массива: ");
// тут пользователь сам ввозит элементы массива
        int[] arrUser = new int[scanner.nextInt()];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < arrUser.length; i++) {
            arrUser[i] = scanner.nextInt();
        }
        System.out.print("Содердивое массива: ");
        for (int ligen : arrUser) {
            System.out.print(ligen + " ");
        }

        int n = arrUser.length;

        // начинает проходить массив не с начала, а с конца для этого и n-1;
        for (int i = n - 1; i >= 0; i--) {
            arrUser[i]++;
            if (arrUser[i] < 10) {
                break;
            }

            if (i == 0 && arrUser[i] == 10) {
                int[] newArr = new int[n + 1];
                newArr[0] = 1;
                for (int j = 1; j < newArr.length; j++) {
                    newArr[j] = 0;
                }
                arrUser = newArr;
                break;
            } else {
                arrUser[i] = 0;
            }
        }
        System.out.println(" ");
        System.out.print("Содердивое массива после прибавления 1(ед) :   ");
        for (int ligen : arrUser) {
            System.out.print(ligen + " ");
        }
    }
}
