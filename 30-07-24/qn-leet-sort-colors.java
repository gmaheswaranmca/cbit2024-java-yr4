class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length;
        int left = 0, right=size-1;
        int oneIndex = left, twoIndex = right;
        for(int I = left; I <= right; I++) {
            if(nums[I] == 0) {
                int t1 = nums[I]; nums[I] = nums[oneIndex];nums[oneIndex] = t1;
                oneIndex ++;
            }
            else if(nums[I] == 2) {//[1,2,0] -> [1,0,2]
                int t2 = nums[I]; nums[I] = nums[twoIndex]; nums[twoIndex] = t2;
                twoIndex --;  right--; 
                I--; /* the swapped element may be the zero at index I, stay there */
            }
        }
    }
}