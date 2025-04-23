import java.util.Scanner;

public class third_task {
    class MathUtils{
        public static double sum(double a,double b){
            double result=a+b;
            System.out.println(result);
            return result;
        }
        public static double difference(double a,double b){
        double result=a-b;
        System.out.println(result);
        return result;
        }
        public static double multiplication(double a,double b){
            double result=a*b;
            System.out.println(result);
            return result;
        }
        public static double division(double a,double b){
            if (b == 0) {
                System.out.println("Ошибка: деление на ноль!");
                return 0;
            }
            double quotient = a / b;
            System.out.println(quotient);
            return quotient;
        }
        public static double indegree(double a,double b){
            double result=Math.pow(a,b);
            System.out.println(result);
            return result;
        }
        public static long factorialRecursive(int n) {
            if (n < 0) throw new IllegalArgumentException("Факториал отрицательного числа не существует");
            if (n == 0 || n == 1) return 1;
            return n * factorialRecursive(n - 1);
        }
}
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число (a): ");
        double a=scanner.nextDouble();
        System.out.println("Введите второе число (b): ");
        double b=scanner.nextDouble();
        System.out.println("Введите число для подсчёта факториала(n): ");
        int n=scanner.nextInt();
        MathUtils.division(a,b);
        MathUtils.multiplication(a, b);
        MathUtils.sum(a, b);
        MathUtils.difference(a, b);
        MathUtils.indegree(a,b);
        System.out.println(MathUtils.factorialRecursive(n));
    }
}
