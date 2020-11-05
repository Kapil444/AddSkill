class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         if (p.length() > s.length()) {
            return new ArrayList<>();
        }
        int i = 0,j = p.toCharArray().length-1;
        List<Integer> res = new ArrayList<>();
        int arr[] = new int[26];
        int arr1[] = new int[26];
        
        String sub=s.substring(0,p.toCharArray().length);
        
        j = 0;
        for(char c : sub.toCharArray()){
            arr[c-'a']++;
            arr1[p.charAt(j++)-'a']++;
        }  
       i = 0;
        if(checkAnagram(arr,arr1)){
            res.add(0);
        }
        
            for(int k = p.length();k<s.length();k++){
                arr[s.charAt(i)-'a']--;
                arr[s.charAt(k)-'a']++;
                boolean check = checkAnagram(arr,arr1);
                i++;
                if(check){
                    res.add(i);
                }
            }
        return res;
    }
    
    
    public boolean checkAnagram(int []arr,int []arr1){
        
        for(int i = 0;i<26;i++){
            if(arr[i]!=arr1[i]){
                return false;
            }
        }
        return true;
    }
}
