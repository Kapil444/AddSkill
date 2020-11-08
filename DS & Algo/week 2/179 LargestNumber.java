class Solution {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            arr[i] = Integer.toString(nums[i]);
        }
        if(count==nums.length){
            return "0";
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                String str1 = arr[i]+arr[j];
                String str2 = arr[j]+arr[i];
                if(str1.compareTo(str2)<=0){
                    String s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
        }
        StringBuffer sb=new StringBuffer();  
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return new String(sb);
    }
    
}
