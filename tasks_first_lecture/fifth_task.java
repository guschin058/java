public class fifth_task {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 4, 4, 6};
        System.out.println("Номера отличающихся элементов:");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                System.out.println(i);
            }
        }
    }
}
