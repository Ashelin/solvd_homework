package Sort;

class Sort {
    public static void main(String[] args) {
        int[] arr = {1211, -34, 14, 624, -1, 0, 23, 77, 23425, -213156, 13413};

        System.out.println("Array:");
        showArray(arr);
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array After Bubble Sort:");
        showArray(arr);
        System.out.println();

        bubbleSortRev(arr);

        System.out.println("Array After Reversed Bubble Sort:");
        showArray(arr);
    }

    static void showArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void bubbleSortRev(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
