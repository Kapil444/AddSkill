class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid = -1;
        while(l<=r){
             mid = l + (r-l)/2;
            if(nums[mid]>=nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        int start = mid;
        l = 0;
        r = nums.length-1;
        if(target>=nums[start] && target <=nums[r]){
            l = start;
        }else{
            r = start;
        }
        while(l<=r){
            mid = l + (r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        
        return -1;
    }
}
