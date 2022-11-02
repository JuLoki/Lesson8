import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        System.out.println("Введите " + size + " любых чисел");
        int[] array = new int[size];
        creatArray(scanner, size, array);
        getSortedArray(array);
    }

    private static void creatArray(Scanner scanner, int size, int[] array) {
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    private static void getSortedArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i = 0;
                }
            }
        System.out.println(Arrays.toString(array));
    }
}