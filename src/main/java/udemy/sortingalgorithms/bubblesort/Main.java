package udemy.sortingalgorithms.bubblesort;

import common.ArrayPrinter;

public class Main {
    static void bubbleSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            /*
              sau mỗi lần lặp ta đẩy được giá trị lớn nhất về cuối, vì thế nếu mảng input có n phần tử thì chỉ cần lặp n-1 giá trị i là đủ
              ----
              ---x
              --xx
              -xxx --> we can stop here and the 0 index have already been in right position
              **/
            boolean swapped = false;        // optimized trick: stop when there isn't swap in inner loop. It means out array is already sorted
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int tmp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayPrinter printObj = new ArrayPrinter();
        int[] input = {1,4,1,2,7,5,2};
        bubbleSort(input);
        printObj.printArr(input);
    }
}
