class Solution {
    public int mySqrt(int x) {
      //  double ans = Math.abs(Math.sqrt(x));
       // return (int)ans;

        int l=1;
        int r=x;
        while(l<=r){
            int m=(l+r)/2;
            if(m>x/m){
                r=m-1;
            }
            else if(m<x/m){
                l=m+1;
            }
            else{
                return m;
            }
        }
        return r;
    }
}