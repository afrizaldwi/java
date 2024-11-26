package latihan;

public class Sorting {
     public static void main(String[] args) {
        int[] array1 = new int[10];
        fillArray(array1);
        System.out.println("Before sorting: ");
        displayArray(array1);
        
        System.out.println("Bubblesort after sorting: ");
        bubbleSort(array1);
        displayArray(array1);
    }
    
    static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        
        return array;
    }
    
    static void displayArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
