package Algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];
        int target = 72;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
//        int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at " + index);
        }
    }
    private static int binarySearch(int[] array, int target) {
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            int middleValue = array[middleIndex];

            System.out.println("middle value is: " + middleValue);

            if(middleValue < target) lowIndex = middleIndex + 1;
            else if(middleValue > target) highIndex = middleIndex - 1;
            else return middleIndex;
        }
        return -1;
    }
}






















