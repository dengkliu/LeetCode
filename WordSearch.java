public class WordSearch {

    // Declare a global array of boolean
    static boolean[][] visited;

    // first find the cell that contains the same char as word.charAt(0)
    public boolean exist(char[][] board, String word) {

        // initilize the boolean array
        visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
                    return true;
                    // if we find the cell, and if we can find the whole word in the adjacent cells, we win
                }
            }
        }

        return false;
    }

    private boolean search(char[][]board, String word, int i, int j, int index){

        if(index == word.length()){
            return true;
        }

        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
            return false;
        }

        visited[i][j] = true;
        if(search(board, word, i-1, j, index+1) || 
           search(board, word, i+1, j, index+1) ||
           search(board, word, i, j-1, index+1) || 
           search(board, word, i, j+1, index+1)){
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}