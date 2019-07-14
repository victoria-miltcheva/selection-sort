import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {
  private int[] list;

  @BeforeEach
  public void init() {
    list = new int[] { 10, 4, 3, 1, 9, 7, 8, 2, 5, 6 };
  }

  @Test
  public void test_ascendingOrderSort() {
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, SelectionSort.sort(list, true));
  }

  public void test_descendingOrderSort() {
    assertArrayEquals(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, SelectionSort.sort(list, true));
  }

  public void test_duplicateSort() {
    list = new int[] { 9, 3, 7, 1, 4, 3, 9, 2, 7 };
    
    assertArrayEquals(new int[] { 1, 2, 3, 3, 4, 7, 7, 9, 9 }, SelectionSort.sort(list, true));
  }

  public void test_emptyList() {
    list = new int[0];

    assertArrayEquals(new int[0], SelectionSort.sort(list, true));
  }

  public void test_length1List() {
    list = new int[] { 10 };

    assertArrayEquals(SelectionSort.sort(list, true), new int[] { 10 });
  }

}
