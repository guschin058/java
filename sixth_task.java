import java.util.*;

public class sixth_task {
    public static void main(String[] args) {
        String sentence = "Java is a programming language that is concurrent, class-based and object-oriented.";

        // Разбиваем строку на слова и убираем знаки препинания
        String[] words = sentence.split("\\s+");
        Set<String> wordSet = new HashSet<>();

        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z-]", "").toLowerCase();
            if (!cleanedWord.isEmpty()) {
                wordSet.add(cleanedWord);
            }
        }

        // Удаляем слова длиной 3 символа и меньше
        Iterator<String> iterator = wordSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() <= 3) {
                iterator.remove();
            }
        }

        // Сортируем и выводим оставшиеся слова
        List<String> sortedWords = new ArrayList<>(wordSet);
        Collections.sort(sortedWords);

        System.out.println("Оставшиеся слова (отсортированные):");
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}