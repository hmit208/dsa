package udemy.sortingalgorithms.countingsort;

public class Main {
    static int[] countingSort(int[] input) {
        int[] output = new int[input.length];
        int[] countArray = new int[10];
        for (int i = 0; i < input.length; i++) {
            countArray[input[i]]++;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
        printArr(countArray);
        for (int i = 0;  i < input.length; i++) {
            output[--countArray[input[i]]] = input[i];
        }


        return output;
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);;
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] input = {1, 5, 6, 4, 2, 5, 3, 4, 7, 8, 9, 1, 2};
        int[] output = countingSort(input);
        printArr(output);
    }
}
