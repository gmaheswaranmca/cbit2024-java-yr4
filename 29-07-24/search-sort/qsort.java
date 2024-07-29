import java.util.*;
public class qsort {
    public static void main(String[] args) {
      Sorting sorting = new Sorting();
      int[] numbers = {30, 50, 100, 80, 10, 90, 20, 60};
      System.out.printf("Before Sort:"); sorting.print(numbers, 0, numbers.length - 1);
      sorting.qsort(numbers, 0, numbers.length - 1); //O(N * log N)
      System.out.printf("\nAfter Sort:"); sorting.print(numbers, 0, numbers.length - 1);
  }
}
class Sorting {
  public int partition(int[] nums, int left, int right) {
    int pivot_init_index = right;
    int pivot = nums[pivot_init_index];
    int pivot_new_index = left;//greater element index
    for(int I = left; I < pivot_init_index; I++){ // O(N)
      if(nums[I] < pivot) { 
        //swap lesser element and greater element 
        int t1 = nums[I];
        nums[I] = nums[pivot_new_index];
        nums[pivot_new_index] = t1;
        //change the greater element index 
        pivot_new_index += 1;
      }
    }
    //swap the first greater element and pivot  
    if(pivot_new_index != pivot_init_index) {
      int t2 = nums[pivot_init_index];
      nums[pivot_init_index] = nums[pivot_new_index];
      nums[pivot_new_index] = t2;
    }
    //pivot_new_index is the pivot position and pivot placed 
    System.out.printf("\n\tAfter pivot%d@[%d->%d] in list@[%d-%d]", pivot, pivot_init_index, pivot_new_index, left, right); this.print(nums, left, right);
    return pivot_new_index;
  }
  public void qsort(int[] nums, int left, int right) { //O(log N) // bin search 
    if(left >= right) { return; }
    int pivot_index = this.partition(nums, left, right);
    this.qsort(nums, left, pivot_index - 1);
    this.qsort(nums, pivot_index + 1, right);
  }
  public void print(int[] nums, int left, int right) {
    for(int I = left; I <= right; I++) {
      System.out.printf("%d ", nums[I]);
    }
  }
}

