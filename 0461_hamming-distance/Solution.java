public class Solution {
    public int hammingDistance(int x, int y) {
        int r = x^y;
        int num=0;
        while(r>0){
            r&=r-1;
            num++;
        }
        return num;
    }
}