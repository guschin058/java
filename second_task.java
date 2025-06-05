import java.util.ArrayList;
import java.util.List;

// Пользовательское исключение
class NoSpaceException extends Exception {
    public NoSpaceException(String message) {
        super(message);
    }
}

public class second_task {
    public static List<String> splitBySpaces(String input) throws NoSpaceException {
        if (!input.contains(" ")) {
            throw new NoSpaceException("Строка не содержит пробелов: \"" + input + "\"");
        }
        List<String> words = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                if (start < i) {
                    words.add(input.substring(start, i));
                }
                start = i + 1;
            }
        }
        if (start < input.length()) {
            words.add(input.substring(start));
        }
        return words;
    }
    public static void main(String[] args) {
        // Тестовые случаи
        String[] testCases = {
                "Hello world Java",
                "OneWord",
                "  Multiple   spaces  ",
                ""
        };
        for (String test : testCases) {
            try {
                System.out.println("Обрабатываем строку: \"" + test + "\"");
                List<String> result = splitBySpaces(test);
                System.out.println("Результат: " + result);
            } catch (NoSpaceException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
            System.out.println();
        }
    }
}