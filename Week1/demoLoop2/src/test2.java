import java.util.Arrays;

public class test2 {
  public static void main(String[] args) {
    int[] nums = new int[] {2, 11, 10, 1, 3, 12, 13};
    int min;
    int count = 0;
    int[] newNums = nums;
    int indexY = 0;
    int length = nums.length;
    int k = 10;
    for (int i = 0; i < nums.length; i++) {
      min = newNums[0];
      System.out.println(min);
      for (int j = 0; j < newNums.length; j++) {
        if (min >= newNums[j]) {
          min = newNums[j];
          indexY = j;
        }
      }
      System.out.println(min);
      if (k <= min) {
        break;
      }
      length--;
      count++;

      int[] temp = new int[length];
      for (int p = 0; p < indexY; p++) {
        temp[p] = newNums[p];
      }
      if (indexY != newNums.length) {
      for (int r = indexY; r < length; r++) {
        temp[r] = newNums[r + 1];
      }
    }
      System.out.println(Arrays.toString(temp));
      newNums = temp;

    }
System.out.println(count);
  }
}
