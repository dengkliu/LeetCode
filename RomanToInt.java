public class RomanToInt {
    
    private Map<Character, Integer> map = new HashMap<Character, Integer>() {
    {
    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);}
    };
    
    public int romanToInt(String s) {
        if(s==null) return 0;
        if(s.length()==1) return map.get(s.charAt(0));
        
        int result=0;
        int i=0;
        while(i<s.length()){
            int j=i+1;
            Integer current=map.get(s.charAt(i));
            Integer forward=0;
            if(j<s.length()) forward=map.get(s.charAt(j));
            
            if(current>=forward) {result=result+current;i=i+1;}
            else {result=result+forward-current;i=i+2;}
        }
        return result;
    }
    }
