class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high-low) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[low] <= nums[mid]){   //left part sorted or not
                if(target >= nums[low] && target < nums[mid]){    //find
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{                   //right part sorted
                if(target > nums[mid] && target <= nums[high]){  //find
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }

        return -1;
    }
}