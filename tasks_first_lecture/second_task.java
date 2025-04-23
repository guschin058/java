import java.util.Scanner;
public class second_task {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя и Фамилию: ");
        String str1 = scanner.nextLine(); 
        String[] parts = str1.split(" "); 

        if (parts.length == 2){
            char first_inintial = parts[0].charAt(0);
            char second_inintial = parts[1].charAt(0);
            System.out.println(first_inintial + "." + second_inintial + ".");
        } else{
            System.out.println("Данные,подаваемые на вход программы некорректны");
        }

    }
}
