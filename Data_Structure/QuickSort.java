import java.util.Arrays;

class Quicksort {

  public static int partition(int array[], int low, int high) {
    
    int pivot = array[high];
    
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return (i + 1);
  }

  public static void quickSort(int array[], int low, int high) {
    if (low < high) {

      int pivot = partition(array, low, high);
      
      quickSort(array, low, pivot - 1);

      quickSort(array, pivot + 1, high);
    }
  }
}

class Main {
  public static void main(String args[]) {

    int[] data = { 8, 7, 2, 1, 0, 9, 6 };

    int size = data.length;
    Quicksort.quickSort(data, 0, size - 1);

    System.out.println("Sorted Order ");
    System.out.println(Arrays.toString(data));
  }
}