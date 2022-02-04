package common;

public class ArrayPrinter {
    public void printArr(int[] arr) {
        System.out.print("[");
        for (int j : arr) {
            System.out.print(j);
        }
        System.out.print("]");
    }
}
