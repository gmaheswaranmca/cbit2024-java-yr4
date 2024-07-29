import java.util.*;
public class isort {
    public static void main(String[] args) {
      Sorting sorting = new Sorting();
      int[] numbers = {30, 50, 100, 80, 10, 90, 20, 60};
      System.out.printf("Before Sort:"); sorting.print(numbers,numbers.length);
      sorting.isort(numbers, numbers.length);
      System.out.printf("\nAfter Sort:"); sorting.print(numbers,numbers.length);
  }
}
class Sorting {
  public void isort(int[] nums, int N)
  {
    for(int I=1; I<N; I++) { //2nd..last element, find place in sorted list
      int key = nums[I]; //first element from unsorted list 
      int keyPosition = I;
      for(int sindex = I-1;  sindex>=0 && nums[sindex] > key; sindex--){//seek key in sorted list
         keyPosition -= 1; // finding the key position
         nums[sindex+1] = nums[sindex]; // shift right 
         //T2//System.out.printf("\n\t\tParallel Shift for %d:",key); this.print(nums,N);
      }
      
      if(keyPosition != I){
        nums[keyPosition] = key;
      }
      //T1//System.out.printf("\n\tPlaced unsorted element %d@%d:",key,keyPosition); this.print(nums,N);
    }
  }
  public void print(int[] nums, int N){
    for(int I = 0; I < N; I++) {
      System.out.printf("%d ", nums[I]);
    }
  }
}