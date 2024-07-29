import java.util.*;



public class lsearch {
    public static void main(String[] args) {
      Searching searching = new Searching();
      int[] numbers = {30, 50, 100, 80, 10, 90, 20, 60};
      int target1 = 100;
      int index1 = searching.lsearch(numbers, target1);
      System.out.printf("The index of %d found is at %d\n", target1, index1);
      int target2 = 85;
      int index2 = searching.lsearch(numbers, target2);
      System.out.printf("The index of %d found is at %d\n", target2, index2);
  }
}

class Searching {
  public int lsearch(int[] nums, int key)
  {
      for(int I = 0; I < nums.length; I++) {
          if(key == nums[I]) {
              return I; 
          }
      }
      return -1;
  }
}