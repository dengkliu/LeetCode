public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String lcp = strs[0];
        for(int i=1; i< strs.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j =0; j < Math.min(lcf.length(), strs[i].length()); j++){
                char ch1 = lcf.charAt(j);
                char ch2 = strs[i].charAt(j);
                if(ch1 == ch2){
                    sb.append(ch1);
                }else{
                    break;
                }

            }
            lcp = sb.toString();
        }
        return lcp;
    }
}