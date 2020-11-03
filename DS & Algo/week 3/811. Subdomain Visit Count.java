class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        Map<String ,Integer> map = new HashMap<>();
        for(String str  : cpdomains){
            int count = Integer.parseInt(str.substring(0,str.indexOf(" ")));            
            String remain = str.substring(str.indexOf(" "));
            remain = remain.trim();
            while(remain!=null){
                if(map.getOrDefault(remain,0)!=0){
                    int tot = map.get(remain);
                    map.put(remain,tot+count);
                }else{
                    map.put(remain.trim(),count);
                }
                if(remain.indexOf(".")!=-1){
                remain = remain.substring(remain.indexOf(".")+1); 
                }else{
                    remain = null;
                }
            }             
        }
        for(Map.Entry entry : map.entrySet()){
            String s = Integer.toString((Integer)entry.getValue());
            s = s+" " + entry.getKey();
            result.add(s);
        }
        return result;
    }
}
