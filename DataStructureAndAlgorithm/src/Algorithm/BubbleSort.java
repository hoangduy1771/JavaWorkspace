package Algorithm;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {5, 3, 9, 1, 4, 7, 6, 2, 8};

        bubbleSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }

}
