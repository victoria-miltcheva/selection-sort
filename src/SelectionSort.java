
public class SelectionSort {
  
  int[] sort(int[] list, boolean ascending) {
    return ascending ? sortAscending(list) : sortDescending(list);
  }
  
  private int[] sortAscending(int[] list) {
    int[] listAscending = new int[list.length];
    
    for (int i = 0; i < list.length; i++) {
      listAscending[i] = list[findSmallestIndex(list)];
    }
    
    return listAscending;
  }
  
  private int[] sortDescending(int[] list) {
    int[] listDescending = new int[list.length];
    
    for (int i = 0; i < list.length; i++) {
      listDescending[i] = list[findLargestIndex(list)];
    }
    
    return listDescending;
  }
  
  private int findSmallestIndex(int[] list) {
    int smallestIndex = 0;
    
    for (int i = 0; i < list.length; i++) {
      if (list[smallestIndex] > list[i]) {
        smallestIndex = i;
      }
    }
    
    return smallestIndex;
  }
  
  private int findLargestIndex(int[] list) {
    int largestIndex = 0;
    
    for (int i = 0; i < list.length; i++) {
      if (list[largestIndex] < list[i]) {
        largestIndex = i;
      }
    }
    
    return largestIndex;
  }
}
