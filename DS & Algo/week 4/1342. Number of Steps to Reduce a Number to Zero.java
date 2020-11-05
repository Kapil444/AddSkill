lass Solution {
    public int numberOfSteps (int num) {
        int res = 0;
        while(num!=0){           
            if(num%2==0){
                res++;
                 num = num/2;
            }else{
                res++;
                num = num-1;
            }            
        }
        return res;
    }
}
