import java.util.*;

public class ninth_task {
    // Метод для вывода массива любого типа (кроме примитивов)
    public static <T> void printArray(T[] array) {
        System.out.println("Элементы массива (" + array.getClass().getComponentType().getSimpleName() + "):");
        for (T element : array) {
            System.out.println(element);
        }
        System.out.println();
    }

    // Метод для вывода коллекции любого типа
    public static <T> void printCollection(Collection<T> collection) {
        System.out.println("Элементы коллекции (" + collection.getClass().getSimpleName() + "):");
        for (T element : collection) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Создаем массивы разных типов
        String[] strings = {"Java", "Python", "C++"};
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3};

        // Создаем коллекции разных типов
        List<String> stringList = Arrays.asList("Apple", "Banana", "Orange");
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(10, 20, 30));
        Queue<Double> doubleQueue = new LinkedList<>(Arrays.asList(1.5, 2.5, 3.5));

        // Выводим массивы
        printArray(strings);
        printArray(integers);
        printArray(doubles);

        // Выводим коллекции
        printCollection(stringList);
        printCollection(integerSet);
        printCollection(doubleQueue);
    }
}