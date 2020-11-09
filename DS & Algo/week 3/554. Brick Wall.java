class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(List<Integer>list : wall){
            int end = 0;
            for(int i = 0;i<list.size()-1;i++){
                end +=list.get(i);
                map.put(end,map.getOrDefault(end,0)+1);
                count = Math.max(count,map.get(end));
            }
        }
        return wall.size()-count;
    }
}
