public class Task1 {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        // Задание 1
        int amout = 0;
        for (int i = 0; i < array.length; i++) {
            amout += array[i];
        }
        System.out.println("Сумма трат за месяц составляет " + amout + " рублей.");
        // Задание 2
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }


        }
        System.out.println("Минимальная сумма трат за день равна " + min + " рублей");
        System.out.println("Максимальная сумма трат за день равна " + max + " рублей");
        // Задание 3
        double average = (double) amout / array.length;
        System.out.println("Среднее значение за 30 дней составляет " + average + " рублей");
        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println();
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}
