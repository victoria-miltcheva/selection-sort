
public class SelectionSort {

  /**
   * 
   * Takes in an unsorted array and a flag which indicates ascending or descending
   * order. Next, depending on the sort order the appropriate method is called in
   * order to sort the array using the selection sort algorithm.
   * 
   * @param list      Unsorted array of integers
   * @param ascending Flag indicating if the order is ascending or descending
   * @return
   */
  protected static int[] sort(int[] list, boolean ascending) {
    if (list.length == 0) {
      return new int[0];
    } else if (list.length == 1) {
      return list;
    }

    return ascending ? sortAscending(list) : sortDescending(list);
  }

  /**
   * 
   * Performs the selection sort algorithm in order to sort the given array in
   * ascending order. First, find the index of the smallest item in the array,
   * then swap that item with the item at the current array index. Repeat until
   * the last index of the array is reached.
   * 
   * @param list Unsorted array of integers
   * @return
   */
  static private int[] sortAscending(int[] list) {
    int smallestIndex;
    int temp;

    for (int i = 0; i < list.length; i++) {
      smallestIndex = findSmallestIndex(list, i);

      temp = list[i];
      list[i] = list[smallestIndex];
      list[smallestIndex] = temp;
    }

    return list;
  }

  /**
   * 
   * Performs the selection sort algorithm in order to sort the given array in
   * descending order. First, find the index of the largest item in the array,
   * then swap that item with the item at the current array index. Repeat until
   * the last index of the array is reached.
   * 
   * @param list Unsorted array of integers
   * @return
   */
  static private int[] sortDescending(int[] list) {
    int largestIndex;
    int temp;

    for (int i = 0; i < list.length; i++) {
      largestIndex = findLargestIndex(list, i);

      temp = list[i];
      list[i] = list[largestIndex];
      list[largestIndex] = temp;
    }

    return list;
  }

  /**
   * 
   * Finds the array index containing the smallest item.
   * 
   * @param list Unsorted array of integers
   * @return
   */
  private static int findSmallestIndex(int[] list, int from) {
    int smallestIndex = from;

    for (int i = from; i < list.length; i++) {
      if (list[smallestIndex] > list[i]) {
        smallestIndex = i;
      }
    }

    return smallestIndex;
  }

  /**
   * 
   * Finds the array index containing the largest item.
   * 
   * @param list Unsorted array of integers
   * @return
   */
  private static int findLargestIndex(int[] list, int from) {
    int largestIndex = from;

    for (int i = from; i < list.length; i++) {
      if (list[largestIndex] < list[i]) {
        largestIndex = i;
      }
    }

    return largestIndex;
  }
}
