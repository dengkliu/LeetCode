public class WordSearchII {
    
      public List<String> findWords(char[][] board, String[] words) {
        
        List<String> res = new ArrayList<String>();
        
        char[][] temp = new char[board.length][board[0].length];
        for (int i=0; i<board.length; i++){
                for(int j=0; j<board[i].length; j++){
                    temp[i][j]=board[i][j];
                }
            }
        
        for (String word : words){
            
            board=temp;
            if(isExist(board, word)){
                res.add(word);
                continue;
            }
        }
        return res;
    }
    
    public boolean isExist(char[][] board, String word){
        
         for (int i=0; i<board.length; i++){
                for(int j=0; j<board[i].length; j++){
                    if (find_word(board, word, i, j, 0)) return true; 
                 }
         }
         
         return false;
    }
    
    public boolean find_word(char[][] board, String word, int i, int j, int index){
        
        if (index==word.length()) return true;
        
        if (i<0 || i>=board.length || j<0 || j>=board[i].length) return false;
        
        if (board[i][j]!=word.charAt(index)) return false;
        
        char temp=board[i][j];
        
        board[i][j] = '*';
        
        if (find_word(board, word, i-1, j, index++)||
            find_word(board, word, i+1, j, index++)||
            find_word(board, word, i, j-1, index++)||
            find_word(board, word, i, j+1, index++)) return true;
        
        board[i][j]= temp;
        
        return false;
 
    }
}