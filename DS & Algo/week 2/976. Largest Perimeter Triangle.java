class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int max = Integer.MIN_VALUE;
        int i = A.length -1;
        while(i>1){           
            if((A[i]+A[i-1]>A[i-2]) && (A[i]+A[i-2]>A[i-1])&& (A[i-2]+A[i-1]>A[i])){
                return A[i]+A[i-1]+A[i-2];
            }else{
                i--;
            }
        }
        return 0;
    }
}
