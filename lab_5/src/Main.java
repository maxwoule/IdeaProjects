public class Main {
    public static void main(String[] args) {
        short[] shortArray1 = {5, 2, 7, 1, 3, 4, 6};
        short[] shortArray2 = {9, 10, 8, 12, 11, 14, 13};
        System.out.println("First task: ");
        insertionSort(shortArray1);
        printArray(shortArray1);
        System.out.println("Second task: ");
        bubbleSort(shortArray2);
        printArray(shortArray2);
    }

    public static void bubbleSort(short arr[]) {
        int n = arr.length;
        short temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] < arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(short array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            short key = array[j];
            int i = j-1;
            while ((i > -1) && ( array [i] < key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }


    public static void printArray(short[] arr) {
        System.out.print("Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // Print a new line after printing the array elements
    }
}