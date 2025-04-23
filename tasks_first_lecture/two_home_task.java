import java.util.Scanner;

public class two_home_task {
    public static void main(String[] args) {
        // Объявление и инициализация массива на 5 элементов
        String[] names = {"Егор", "Лиза", "Максим", "Яна", "Саша","Антон"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String inputName = scanner.nextLine();

        boolean found = false; //флаг для отслеживания наличия имени

        //перебор  массива используя цикл for-each
        for (String name : names) {
            if (inputName.equals(name)) {
                found = true;
                break;
            }
            }

        if (found) {
            System.out.println("Имя \"" + inputName + "\" есть в массиве.");
        } else{
            System.out.println("Имени \"" + inputName + "\" нет в массиве.");
        }
        }

}