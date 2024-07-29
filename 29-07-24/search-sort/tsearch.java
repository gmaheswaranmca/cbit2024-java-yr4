import java.util.*;
public class Solve {
    public static void main(String[] args) {
      Searching searching = new Searching();
      int[] numbers =   {10, 20, 30, 50, 60, 80, 90, 100};
      int target1 = 90;
      int index1 = searching.tsearch(numbers, 0, numbers.length-1, target1);
      System.out.printf("The index of %d found is at %d\n", target1, index1);
      int target2 = 85;
      int index2 = searching.tsearch(numbers, 0, numbers.length-1, target2);
      System.out.printf("The index of %d found is at %d\n", target2, index2);
  }
}
class Searching {
  public int tsearch(int[] nums, int left, int right, int key)
  {
      System.out.printf("@2[%d,%d]",left,right);
      if (left <= right) {
        int oneThird = (left + right) / 3;
        int mid1 = left + oneThird;
        int mid2 = right - oneThird;
        
        if(mid1 > mid2){ return -1; }
        System.out.printf("[%d,%d]",mid1,mid2);
        if(key == nums[mid1]) { 
          return mid1;
        }
        else if(key == nums[mid2]) { 
          return mid2;
        }
        else {
          if(key < nums[mid1]) { 
            return this.tsearch(nums,left,mid1-1,key);
          }
          else if(key > nums[mid2]) {
            return this.tsearch(nums,mid2+1,right,key);
          }
          else if(key > nums[mid1] && key < nums[mid2]){ 
            return this.tsearch(nums,mid1+1,mid2-1,key);
          }
        }
      }
      return -1;
  }
}