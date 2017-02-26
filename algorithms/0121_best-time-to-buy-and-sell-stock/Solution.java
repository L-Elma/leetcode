public class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        if(prices.length>=2){
            int last=prices[0];
            for(int i=1;i<prices.length;i++){
                if(prices[i]-last>max){
                    max=prices[i]-last;
                }
                if(last>prices[i]){
                    last=prices[i];
                }
            }
        }
        return max;
    }
}