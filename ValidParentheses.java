public class Solution {
    private Map<Character, Character> brackets = new HashMap<Character, Character>(){
        {
            put(')','(');
            put(']','[');
            put('}','{');
        }
    };
    
    public boolean isValid(String s) {
        if(s==null) return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char item=s.charAt(i);
            if(item==')'||item==']'||item=='}'){
                if (stack.isEmpty()) return false;
                Character pop=stack.pop();
                if(pop!=brackets.get(item)) return false;}
            else stack.push(item);
        }
        return stack.isEmpty();
    }
}