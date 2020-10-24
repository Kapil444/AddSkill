class Solution {
    public int mySqrt(int x) {
        if(x==0 ){            
            return 0;
        }
        if(x==1){
            return 1;
        }
        double temp;
        double sr = x/2;
        do
        {
            temp = sr;
            sr = (temp+(x/temp))/2;
        }
        while((temp-sr!=0));
        return (int)(temp);
    }
}
