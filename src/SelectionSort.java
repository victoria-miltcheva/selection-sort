
public class SelectionSort {

  protected static int[] sort(int[] list, boolean ascending) {
    if (list.length == 0) {
      return new int[0];
    } else if (list.length == 1) {
      return list;
    }

    return ascending ? sortAscending(list) : sortDescending(list);
  }

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

  private static int findSmallestIndex(int[] list, int from) {
    int smallestIndex = from;

    for (int i = from; i < list.length; i++) {
      if (list[smallestIndex] > list[i]) {
        smallestIndex = i;
      }
    }

    return smallestIndex;
  }

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
