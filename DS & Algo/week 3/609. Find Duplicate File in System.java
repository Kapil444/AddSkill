class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        for(int i = 0;i<paths.length;i++){
            String first = paths[i];
            String strArr[] = first.split(" ");
            
            for(int j = 1;j<strArr.length;j++){              
                  
                String str = strArr[j].substring((strArr[j].indexOf("(")+1),(strArr[j].indexOf(")")));
                String temp = strArr[0]+"/"+strArr[j].substring(0,strArr[j].indexOf("(")).replace(" ","/");
                if(map.getOrDefault(str,null)!=null){
                    List<String> list = map.get(str);
                     list.add(temp);
                    map.put(str,list);
                }else{
                     List<String> list = new ArrayList<>();
                    list.add(temp);
                    map.put(str,list);
            }            
          }           
        }
        
        for(Map.Entry<String,List<String>> entrySet : map.entrySet()){
            if(entrySet.getValue().size()>1)
            result.add(entrySet.getValue());
        }
        
        return result;
    }
}
