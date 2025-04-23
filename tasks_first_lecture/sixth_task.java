import java.util.Random;
import java.util.Arrays;

public class sixth_task {
    public static void main(String[] args){
        char[] Random_chars = new char[15];

        Random random = new Random();
        for (int i = 0; i < Random_chars.length; i++){
            Random_chars[i] = (char) (random.nextInt(26) + 'a');
        }
        System.out.println("Исходный массив случайных символов:");
        System.out.println(Arrays.toString(Random_chars));
        
        Arrays.sort(Random_chars);
        System.out.println("\nОтсортированный массив:");
        System.out.println(Arrays.toString(Random_chars));
        
        int middleStart = Random_chars.length / 2 - 2; 
        int middleEnd = middleStart + 5; 
        char[] middleElements = Arrays.copyOfRange(Random_chars, middleStart, middleEnd);
        
        System.out.println("\nСредние 5 элементов:");
        System.out.println(Arrays.toString(middleElements));
    }
}