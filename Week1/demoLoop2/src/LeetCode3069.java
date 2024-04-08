import java.util.Arrays;

public class LeetCode3069 {
  public static void main(String[] args) {
  int[] nums1 = new int[] {3,7,2,9,5,4,1};
  System.out.println(Arrays.toString(resultArray(nums1))); 

  }

    public static int[] resultArray(int[] nums) {
        int[] arr1 = new int[] {nums[0]};
        int[] arr2 = new int[] {nums[1]};
        for (int i = 2; i < nums.length; i++) {
            if ( arr1[arr1.length - 1] > arr2[arr2.length - 1]) {
                int[] tempArray = arr1;
                arr1 = new int[tempArray.length + 1];
                arr1[(tempArray.length)] = nums[i];
                for(int j = 0; j < tempArray.length; j++) {
                    arr1[j] = tempArray[j];
                }
                System.out.println(Arrays.toString(arr1)); 
            } else {
                int[] tempArray = arr2;
                arr2 = new int[tempArray.length + 1];
                arr2[(tempArray.length)] = nums[i];
                for(int p = 0; p < tempArray.length; p++) {
                    arr2[p] = tempArray[p];

                }
                System.out.println(Arrays.toString(arr2)); 
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < arr1.length) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[i - arr1.length];
            }
        }
        return result;
    }
}
