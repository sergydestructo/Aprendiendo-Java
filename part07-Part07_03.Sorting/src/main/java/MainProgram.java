import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = smallest(array);
        for (int number: array) {
            if (number == smallest) {
                break;
            }
            index++;
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] newArray = Arrays.copyOfRange(table, startIndex, table.length);
        return indexOfSmallest(newArray) + startIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int swap1 = array[index1];
        int swap2 = array[index2];
        array[index2] = swap1;
        array[index1] = swap2;
    }
    
    public static void sort(int[] array) {
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            int toSwap = indexOfSmallestFrom(array, i);
            swap(array, toSwap, i);
            System.out.println(array);
        }
    }

}
