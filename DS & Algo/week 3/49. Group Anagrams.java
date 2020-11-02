class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res= new ArrayList<>();
        if(strs.length==0){
            return res;
        }
        for(String s : strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String temp  = new String(c);
            if(map.getOrDefault(temp,null)!=null){
                List<String> a = map.get(temp);
                a.add(s);
                map.put(temp,a);
            }else{
                List<String> list= new ArrayList<>();
                list.add(s);
                map.put(temp,list);
            }
        }
        
        for(Map.Entry<String,List<String>> hash : map.entrySet()){
            res.add(hash.getValue());
        }
        return res;
    }
}
