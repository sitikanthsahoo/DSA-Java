class Solution {
    public static int findposn(int[] arr, int x,boolean isOk){
        int low = 0;
        int high = arr.length-1;

        int ans = -1;

        while(low<=high){
            int mid = low + (high-low) / 2;

            if(arr[mid] == x){
                ans = mid;
                if(isOk){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];

        if(nums.length == 0){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }

        arr[0] = findposn(nums,target,true);
        arr[1] = findposn(nums,target,false);

        return arr;
    }
}