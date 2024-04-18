package bc2403;

import java.util.Arrays;

public class test {

public static int[] megre(int[] arr1, int[] arr2) {
  int[] newArr = new int[arr1.length + arr2.length];
  int idx1 = 0;
  int idx2 = 0;
  for(int i = 0; i < arr1.length + arr2.length ; i++) {
  if (idx1 == arr1.length) {
    newArr[i] = arr2[idx2++];
    continue;
  }
  if (idx2 == arr2.length) {
    newArr[i] = arr1[idx1++];
    continue;
  }
   if(arr1[idx1] < arr2[idx2]) {
    newArr[i] = arr1[idx1];
    idx1++;
   } else if (arr1[idx1] > arr2[idx2]) {
    newArr[i] = arr2[idx2];
    idx2++;
   } else {
    newArr[i] = arr1[idx1];
    idx1++;
   }
  }
  return newArr;
}

 
  public static void main(String[] args) {
    int[] arr = new int[] {3,27,38,43,45,48,56,72,88};
    int[] arr2 = new int[] {9,10,45,46,71,73,89,99};
    System.out.println(Arrays.toString(megre(arr, arr2)));
  }

}
