import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class third_task {
    public static void printSortedFiles(File directory) {
        if (!directory.isDirectory()) {
            System.out.println("Указанный путь не является директорией!");
            return;
        }
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Директория пуста!");
            return;
        }
        Arrays.sort(files);
        System.out.println("Файлы в директории " + directory.getPath() + ":");
        for (File file : files) {
            System.out.println("  " + file.getName());
        }
    }
    public static void createTextFile(File directory, String fileName) {
        if (!directory.isDirectory()) {
            System.out.println("Указанный путь не является директорией!");
            return;
        }

        File newFile = new File(directory, fileName.endsWith(".txt") ? fileName : fileName + ".txt");

        try {
            if (newFile.createNewFile()) {
                System.out.println("Файл " + newFile.getName() + " успешно создан!");
            } else {
                System.out.println("Файл " + newFile.getName() + " уже существует!");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        File currentDir = new File(".");
        System.out.println("=== Исходный список файлов ===");
        printSortedFiles(currentDir);
        System.out.println("\n=== Создание нового файла ===");
        createTextFile(currentDir, "new_file");
        System.out.println("\n=== Обновленный список файлов ===");
        printSortedFiles(currentDir);
    }
}