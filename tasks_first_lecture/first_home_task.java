import java.util.Scanner;

public class first_home_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Введите первое число:");
            double number1 = scanner.nextDouble();

            System.out.println("Введите оператор (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            System.out.println("Введите второе число:");
            double number2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true; 

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                        if (number2!=0){
                        result = number1 / number2;
                        }
                        else{
                            System.out.println("Деление на ноль запрещено");
                            validOperation=false;
                            break;
                        }
                default:
                    System.out.println("Ошибка: неверный оператор!"); 
                    break;
            }

            if (validOperation) {
                System.out.println("Результат: " + result);
            }

            System.out.println("Хотите выполнить еще одну операцию? (yes/no)");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                flag = false;
                System.out.println("Программа завершена.");
            }
        }
        scanner.close();
    }
}