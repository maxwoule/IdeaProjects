public class Main {
    public static void main(String[] args) {
        int[] myFirstArray = {1, -2, 3, -4, 5};
        int[] mySecondArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] myThirdArray = {1, 2, 3, 4, 5};
        System.out.println("First task: " + findMaxAbsoluteElement(myFirstArray));
        System.out.println("Second task: " + calculateAverageForMultipleOf3(mySecondArray));
        System.out.println("Third task: ");
        printArray(reverseArray(myThirdArray));
    }

    public static int findMaxAbsoluteElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім");
        }

        int maxAbsoluteElement = Math.abs(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int absoluteValue = Math.abs(arr[i]);
            if (absoluteValue > maxAbsoluteElement) {
                maxAbsoluteElement = absoluteValue;
            }
        }

        return maxAbsoluteElement;
    }

    public static double calculateAverageForMultipleOf3(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім");
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }

        if (count == 0) {
            throw new ArithmeticException("Немає елементів з індексами, кратними 3");
        }

        return (double) sum / count;
    }

    static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }

        return reversedArray;
    }

    public static void printArray(int[] arr) {
        System.out.print("Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // Print a new line after printing the array elements
    }
}