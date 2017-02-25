public class Solution {
	public double myPow(double x, int n) {
		double res = 1;
        long absN = Math.abs((long)n);
        while(absN>0) {
            if(absN%2==1){
            	res*=x;
            }
            absN=absN/2;
            x*=x;
        }
        return n>=0?res:1/res;
    }
}