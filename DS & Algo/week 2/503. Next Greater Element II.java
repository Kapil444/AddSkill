class Solution {
    public int[] nextGreaterElements(int[] nums) {        
        
        int arr[] = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            int j=0;
            if(i==nums.length-1){
                j = 0;
            }else{
                j = i+1;
            }
            while(1>0){
                int max = nums[i];
                if(nums[j]>max){
                    max = nums[j];
                    arr[i]=max;
                    break;
                }
                if(j<nums.length-1){
                    j++;
                }else{
                    j = 0;
                }
                if(j==i){
                    arr[i]=-1;
                    break;
                }
            }
        }
        return arr;
        
    }
}
