class Solution {
    public List<String> commonChars(String[] A) {
        List<String> common = new ArrayList<>();
        int min[] = new int[26];
        Arrays.fill(min,Integer.MAX_VALUE);
        for(int i = 0;i<A.length;i++){
            int ch[] = new int[26];
            for(char c : A[i].toCharArray()){
                ch[c-'a']++;
            }
            for(int j = 0;j<26;j++){
                min[j] = Math.min(min[j],ch[j]);
            }
        }
        for(int i = 0;i<26;i++){
            while(min[i]>0){
                common.add(""+(char)(i+'a'));
                min[i]--;
            }
        }
        return common;
    }
}
