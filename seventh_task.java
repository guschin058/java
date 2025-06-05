import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class seventh_task {
    public static void main(String[] args) {
        Queue<Character> charQueue = new LinkedList<>();
        Random random = new Random();

        // Заполняем очередь случайными символами
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            charQueue.add(randomChar);
            System.out.println("Добавлен символ: " + randomChar);
        }

        System.out.println("\nИзвлечение символов из очереди:");
        while (!charQueue.isEmpty()) {
            System.out.println("Извлечен символ: " + charQueue.poll());
        }
    }
}