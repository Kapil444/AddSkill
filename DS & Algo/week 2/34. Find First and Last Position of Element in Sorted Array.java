class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        int arr[] = new int[2];
        Arrays.fill(arr,-1);
        if(nums.length==0 || nums.length==1 && nums[0]!=target){
            arr[0]=-1;
            arr[1] = -1;
            return arr;
        }
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]<=target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        System.out.println(r + " ");
        if(r>=0 && r<nums.length){
               if(nums[r]==target){
                    arr[1] = r; 
                 }else{
                    arr[1] = -1;
                } 
        }else{
            return arr;
        }
        
        
        l = 0;
        r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]>=target){
               r = mid-1; 
            }else{
              l = mid+1;
            }
        }
        arr[0] = l;
        if(l>=0 && l<nums.length){
             if(nums[l]==target){
               arr[0] = l; 
            }else{
                arr[0] = -1;
            }
        }else{
            Arrays.fill(arr,-1);
            return arr;
        }
        
        return arr;
    }
}
