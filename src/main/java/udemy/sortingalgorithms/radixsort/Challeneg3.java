package udemy.sortingalgorithms.radixsort;

public class Challeneg3 {
    public static void main(String[] args) {
        String[] input = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        //do radix sort

        radixSort(input, 26, 5);
        for (int i = 0; i < input.length; i ++) {
            System.out.println(input[i]);
        }
    }

    static void radixSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    /***
     * sort single unit from the least significant to the most (right to left)
     * @param input
     * @param position
     * @param radix
     */
    static void radixSingleSort(String[] input, int position, int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getIndex(position, value)]++;
        }

        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] =
                    input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    /**
     * return numeric value of character from 'a'. Suppose our countArray has index 0 denote 'a', 1 -> 'b' ...
     * @param position
     * @param value
     * @return
     */
    static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
