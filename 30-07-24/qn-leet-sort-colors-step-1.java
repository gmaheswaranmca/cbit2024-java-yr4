/*

Before solving 
array of 0,1 and 2 to get sorted,
we will sort fir 0's and 1's 
in the array using O(N)

 */

import java.util.*;
public class Solve {
    public static void main(String[] args) {
      int [] nums = {1,0,0,1,1,0};
      int N = nums.length;
      int left = 0, right = N -1;
      int oneIndex = 0;
      for(int I = left; I <= right; I++) {
          if(nums[I] == 0) {
              //swapt 0 and at oneIndex 
              int t = nums[I]; nums[I] = nums[oneIndex]; nums[oneIndex] = t;
              oneIndex += 1;
          }
      }
      for(int I=left; I <= right; I++) {
        System.out.printf("%d ", nums[I]);
      }
      
  }
}