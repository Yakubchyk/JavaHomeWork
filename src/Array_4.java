import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество элементов массива: ");

        int[] arrUser = new int[scanner.nextInt()];
        for (int i = 0; i < arrUser.length; i++) {
            arrUser[i] = scanner.nextInt();
        }


    }
}
