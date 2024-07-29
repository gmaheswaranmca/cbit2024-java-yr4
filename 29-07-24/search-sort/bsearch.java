import java.util.*;
public class bsearch {
    public static void main(String[] args) {
      Searching searching = new Searching();
      int[] numbers =   {10, 20, 30, 50, 60, 80, 90, 100};
      int target1 = 90;
      int index1 = searching.bsearch(numbers, 0, numbers.length-1, target1);
      System.out.printf("The index of %d found is at %d\n", target1, index1);
      int target2 = 85;
      int index2 = searching.bsearch(numbers, 0, numbers.length-1, target2);
      System.out.printf("The index of %d found is at %d\n", target2, index2);
  }
}
class Searching {
  public int bsearch(int[] nums, int left, int right, int key)
  {
      while(left <= right) {
        int mid = (left + right) / 2;
        if(key == nums[mid]) { 
          return mid;
        }
        else if(key < nums[mid]) {
          right = mid -1;
        }
        else if(key > nums[mid]) { 
          left = mid + 1;
        }
      }
      return -1;
  }
}