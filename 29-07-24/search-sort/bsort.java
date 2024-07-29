import java.util.*;
public class bsort {
    public static void main(String[] args) {
      Sorting sorting = new Sorting();
      int[] numbers = {30, 50, 100, 80, 10, 90, 20, 60};
      System.out.printf("Before Sort:"); sorting.print(numbers,numbers.length);
      sorting.bsort(numbers, numbers.length);
      System.out.printf("\nAfter Sort:"); sorting.print(numbers,numbers.length);
  }
}
class Sorting {
  public void bsort(int[] nums, int N)
  {
    while(true) {
      boolean isSwapped = false;
      //pass : adjacent elements comparison 
      for(int K = 0; K < (N-1); K++){
        if(nums[K+1] < nums[K]) {
           //swap 
           int t = nums[K+1];
           nums[K+1] = nums[K];
           nums[K] = t;
           // mark as swapped 
           isSwapped = true;
        }//end if 
        //T2//System.out.printf("\n\t\tAfter swap:");this.print(nums,N);
      }//end for 
      //T1//System.out.printf("\n\tAfter pass:");this.print(nums,N);
      N = N - 1; //optimization 1
      if(!isSwapped){ // optimization 2
        break;
      }
    }
  }
  public void print(int[] nums, int N){
    for(int I = 0; I < N; I++) {
      System.out.printf("%d ", nums[I]);
    }
  }
}