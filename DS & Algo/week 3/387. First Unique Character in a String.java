class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        int i = 0;
        while(i<s.length()){
            arr[s.charAt(i)-'a']++;
            i++;
        }
        i = 0;
        while(i<s.length()){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
            i++;
        }
        return -1;
    }
}
