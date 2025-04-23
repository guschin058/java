import java.util.Scanner;
public class first_task {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String inp_1 = scanner1.nextLine();
        int number1 = Integer.parseInt(inp_1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        String inp_2 = scanner2.nextLine();
        double number2 = Double.parseDouble(inp_2);

        double sum = number1 + number2;
        System.out.println(sum);
    }
}
