import java.util.Scanner;
public class fourth_task {
    public static void main(String[] args){
        int c=1;
        String flag="y";
        while (flag.equals("y")){
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите первую границу отрезка: ");
            String inp_1 = scanner1.nextLine();
            double number1 = Double.parseDouble(inp_1);

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Введите вторую границу отрезка: ");
            String inp_2 = scanner2.nextLine();
            double number2 = Double.parseDouble(inp_2);

            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Введите число: ");
            String inp_3 = scanner3.nextLine();
            double number3 = Double.parseDouble(inp_3);

            if ((number3 >= number1 && number3 <= number2)||(number3 >= number2 &&number3 <= number1)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            c+=1;
            if (c>1){
                System.out.println("Желаете ли вы выполнить операцию ещё раз (y/n) ?");
                Scanner choise=new Scanner(System.in);
                flag=choise.next();
                if (!flag.equals("y") && (!flag.equals("n"))){
                    break;
                }
            } 
        }
        
    }
}
