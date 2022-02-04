package udemy.sortingalgorithms.insertionsort;

import common.ArrayPrinter;

public class Main {
    static void insertionSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int tmp = input[i];
            int j;
            for (j = i; j > 0 && input[j - 1] > tmp; j--) {
               input[j] = input[j-1];
            }
            input[j] = tmp;
        }
    }

    static void recursiveInsertionSort(int[] input, int num){
        if (num < 2) {
            return;
        }

        recursiveInsertionSort(input, num - 1);
        int j;
        int newElement = input[num - 1];
        for (j = num - 1; j > 0 && input[j - 1] > newElement; j--) {
            input[j] = input[j-1];
        }
        input[j] = newElement;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 9, 8, 7};
        int[] input2 = {1, 2, 4, 9, 8, 7};
        insertionSort(input);
        recursiveInsertionSort(input2, input2.length);
        ArrayPrinter printer = new ArrayPrinter();
        printer.printArr(input);
        printer.printArr(input2);
    }
}
