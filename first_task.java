import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        final int SIZE = 3;
        int[] numbers = new int[SIZE];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите " + SIZE + " целых числа");

        int index = 0;
        while (true) {  // Бесконечный цикл, выход через break
            try {
                if (index >= numbers.length) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                System.out.print("Число " + (index + 1) + ": ");
                numbers[index] = Integer.parseInt(scanner.nextLine());
                index++;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное целое число!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Достигнут предел массива. Ввод завершен.");
                break;
            }
        }

        System.out.println("\nВведенный массив:");
        printArray(numbers);

        scanner.close();
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
