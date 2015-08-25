import java.util.*;

public class ZigZag {
    public String convert(String s, int numRows) {
        if(numRows<=0||s==null){
            return null;
        }
        
        if(numRows==1){
            return s;
        }
        
        // add the chars row by row
        ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
        for(int i=0; i<numRows;i++){
            StringBuilder builder = new StringBuilder();
            list.add(builder);
        }
        
        // after every round, the char is added into the first row
        // round = numRows + (numRows-2), 2 represents the first and last row
        int round = 2*numRows-2;
        // to assign the right row for each char
        for(int i=0; i<s.length();i++){
            // if the char takes a single column
            // the index should be (numRow-1)-(i%round-(numRow-1))
            // which is 2*numRow-2-i%round, round-i%round
            int index=i%round>(numRows-1)? round-i%round:i%round;
            StringBuilder builder=list.get(index);
            // if the chars should be put in the first or last row
            // they should be put every other numRow-1 positions
            //if(index==0){
            //    builder.insert(i/2, s.charAt(i));
            //}else if (index==(numRows-1)){
            //    builder.insert((i-(numRows-1))/2,s.charAt(i));
            //}else{
            builder.append(s.charAt(i));
            // Anyhow this passed the Leetcode test}
        }
        
        // Why do we do this?
        StringBuilder result = list.get(0);
        for(int i=1; i<list.size();i++){
            result.append(list.get(i).toString());
        }
        
        return result.toString();
    }
}