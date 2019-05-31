package com.xx;

/**
 * 79. 单词搜索
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        if(word.isEmpty()){
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(checkWord(word,board,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkWord(String word, char[][] board, int i, int j, int x){
        if(x==word.length()){
            return true;
        }
        if((i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(x))){
            return false;
        }else{
            board[i][j] += 256;
            if(checkWord(word,board,i-1,j,x+1)||checkWord(word,board,i+1,j,x+1)||checkWord(word,board,i,j-1,x+1)||checkWord(word,board,i,j+1,x+1)){
                return true;
            }
            board[i][j] -= 256;
        }
        return false;
    }
}
