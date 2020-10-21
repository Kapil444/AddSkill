class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        if(j==0){
          if(nums[0]>=target){
              return 0;
          }else{
              return 1;
          }
        }
        
        for(i=0;i<j;i++){
            if(nums[i]>=target){
                  return i;                
            }
            if(nums[j]<=target){
                if(nums[j]==target)
                  return j;
                else
                    return j+1;
            }
            j--;
        }
     if(nums[i]>=target){
              return i;
          }else{
              return i+1;
          }
    }
}
