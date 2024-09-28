import java.util.Arrays;
import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    int size;
    public RandomArrays(int size) {
        this.size = size;
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        // Генерация массива с помощью метода random() класса Math
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100;
        }

        System.out.println("Массив, сгенерированный с помощью метода random() класса Math:");
        System.out.println(Arrays.toString(array1));

        // Генерация массива с помощью класса Random
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble() * 100;
        }

        System.out.println("\nМассив, сгенерированный с помощью класса Random:");
        System.out.println(Arrays.toString(array2));

        // Сортировка массивов
        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("\nОтсортированный массив (метод random() класса Math):");
        System.out.println(Arrays.toString(array1));

        System.out.println("\nОтсортированный массив (класс Random):");
        System.out.println(Arrays.toString(array2));


    }
}
