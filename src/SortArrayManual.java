import java.util.Scanner;

public class SortArrayManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        // Запит кількості елементів (виключно числа)
        while (true) {
            System.out.print("Введіть кількість елементів: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) break;
                else System.out.println("Кількість повинна бути більше нуля.");
            } else {
                System.out.println("Будь ласка, введіть ціле число.");
                scanner.next(); // Очищення неправильного вводу
            }
        }

        int[] array = new int[n];

        // Введення елементів масиву
        for (int i = 0; i < n; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Будь ласка, введіть ціле число.");
                scanner.next(); // Пропуск некоректного вводу
            }
            array[i] = scanner.nextInt();
        }

        // Сортування масиву за зростанням (методом бульбашки)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмін елементів
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Виведення відсортованого масиву
        System.out.println("\nВідсортований масив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}