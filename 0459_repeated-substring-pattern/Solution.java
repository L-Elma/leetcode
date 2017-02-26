public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int slen=s.length();
        for(int q=2;q<=slen;q=q+(q<=2?1:2)){
            if(slen%q==0){
                int sublen=slen/q;
                String sub = s.substring(0, sublen);
                boolean check=true;
                for(int i=1;i<q;i++){
                    if(!sub.equals(s.substring(i*sublen, i*sublen+sublen))){
                        check=false;
                        break;
                    }
                }
                if(check){
                    return true;
                }
            }
        }
        return false;
    }
}