import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int days = 30;
        int[] pays = generateRandomArray(days);

        // Задание 1
        int paysSum = 0;
        for (int i : pays) {
            paysSum += i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", paysSum);

        // Задание 2
        int paysMax = 0;
        int paysMin = 200_000;
        for (int element : pays) {
            if (element < paysMin) {
                paysMin = element;
            }
        }
        System.out.printf("Минимальная сумма трат в день составила %d рублей.\n", paysMin);
        for (int element : pays) {
            if (element > paysMax) {
                paysMax = element;
            }
        }
        System.out.printf("Максимальная сумма трат в день составила %d рублей.\n", paysMax);

        // Задание 3
        double paysMed = (double) paysSum / days;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", paysMed);

        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        // Дополнительные задания
        // https://skyengpublic.notion.site/1-5-1-6-e341c40d890748719f9713a9604d3f71

        // Задание 5
        int size = 3;
        int[][] matrix = new int[size][size];
        for (int indexI = 0; indexI < size; indexI++) {
            for (int indexJ = 0; indexJ < size; indexJ++) {
                if (indexI == indexJ || indexI == size - 1 - indexJ) {
                    matrix[indexI][indexJ] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        // Задание 6
        int[] reverseArr = {5, 4, 3, 2, 1, 8, 7, 9, 10};
        System.out.println(Arrays.toString(reverseArr));
        int[] notReverseArr = new int[reverseArr.length];
        for (int i = 0; i < reverseArr.length; i++) {
            notReverseArr[reverseArr.length - 1 - i] = reverseArr[i];
        }
        System.out.println(Arrays.toString(notReverseArr));

        // Задание 7
        for (int i = 0; i < (reverseArr.length / 2); i++) {
            int temp = reverseArr[i];
            reverseArr[i] = reverseArr[reverseArr.length - 1 - i];
            reverseArr[reverseArr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseArr));

        // Задание 8 & 9
        int[] funnyArr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int indexI = 0; indexI < funnyArr.length; indexI++) {
            for (int indexJ = indexI; indexJ < funnyArr.length; indexJ++) {
                if (funnyArr[indexI] + funnyArr[indexJ] == -2 && indexI != indexJ) {
                    System.out.printf("Сумма элементов массива %d и %d равна -2.\n", funnyArr[indexI], funnyArr[indexJ]);
                }
            }
        }

    }

    public static int[] generateRandomArray(int size) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}