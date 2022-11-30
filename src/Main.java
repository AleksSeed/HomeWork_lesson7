public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int expenses = 0;

        System.out.println("Задание 1");
        for (int i = 0; i < arr.length - 1; i++) {
            expenses = expenses + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + expenses + " рублей");

        System.out.println("\nЗадание 2");
        int minimum = arr[0];
        int maximum = arr[0];
        for (int arr_min : arr) {
            if (arr_min < minimum) {
                minimum = arr_min;
            }
        }
        for (int arr_max : arr) {
            if (arr_max > maximum) {
                maximum = arr_max;
            }
        }
        System.out.println("Минимальная сумма трат за день составила  " + minimum +
                " рублей. Максимальная сумма трат за день составила " + maximum + " рублей");

        System.out.println("\nЗадание 3");
        int average = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            average = average + arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + (average / arr.length) + " рублей");

        System.out.println("\nЗадание 3");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
