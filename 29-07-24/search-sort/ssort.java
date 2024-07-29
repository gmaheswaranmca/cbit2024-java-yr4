import java.util.*;
public class ssort {
    public static void main(String[] args) {
      Sorting sorting = new Sorting();
      int[] numbers = {30, 50, 100, 80, 10, 90, 20, 60};
      System.out.printf("Before Sort:"); sorting.print(numbers,numbers.length);
      sorting.ssort(numbers, numbers.length);
      System.out.printf("\nAfter Sort:"); sorting.print(numbers,numbers.length);
  }
}
class Sorting {
  public void ssort(int[] nums, int N)
  {
    for(int I = 0; I < (N-1); I++) {//selection 
      int min_index = I;
      for(int K = I + 1; K < N; K++) {//pass + compare next elements 
        if(nums[K] < nums[min_index]) {
          min_index = K;
          //T2//System.out.printf("\n\t\tMin Index Seeking:%d",min_index);
        }
      }
      //swap the element and min 
      if(min_index != I) {
        int t = nums[min_index];
        nums[min_index] = nums[I];
        nums[I] = t;
      }
      //T1//System.out.printf("\n\tAfter Pass(sel.at=%d, min.at=%d):",I,min_index); this.print(nums,N);
    }
  }
  public void print(int[] nums, int N){
    for(int I = 0; I < N; I++) {
      System.out.printf("%d ", nums[I]);
    }
  }
}



/*
complexity
    space: O(1)
    time: O(N^2),O(N^2),O(N^2) worst, average, best 
 */