public class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<Character>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        int left=set.size();
        return s.length()-(left==0?0:left-1);
    }
}