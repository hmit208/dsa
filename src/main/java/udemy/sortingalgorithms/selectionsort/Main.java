package udemy.sortingalgorithms.selectionsort;

import common.ArrayPrinter;

public class Main {
    static void selectionSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 9, 8, 7};
        selectionSort(input);
        ArrayPrinter printer = new ArrayPrinter();
        printer.printArr(input);
    }
}
