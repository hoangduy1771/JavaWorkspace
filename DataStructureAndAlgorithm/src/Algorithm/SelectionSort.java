package Algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 4, 7, 6, 2, 8};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length ; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        
    }
}
