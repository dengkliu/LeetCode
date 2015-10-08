public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null) return null;
        if(strs.length == 0){
            return "";
        }
        String lcp = strs[0];
        for(int i=1; i< strs.length; i++){
            StringBuilder result = new StringBuilder();
            for(int j =0; j < Math.min(lcp.length(), strs[i].length()); j++){
                if(lcp.charAt(j) == strs[i].charAt(j)){
                    result.append(lcp.charAt(j));
                }else{
                    break;
                }

            }
            lcp = result.toString();
        }
        return lcp;
    }
}