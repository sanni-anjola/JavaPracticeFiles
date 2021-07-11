package africa.semicolon.chapterSevenExercises;

public class EightQueens {

    private char[][] chessBoard = new char[8][8];

    public boolean isBoardEmpty(){
        for (char[] chars : chessBoard) {
            for (char aChar : chars) {
                if (aChar != 0) return false;
            }
        }
        return true;
    }

    public void placeQueens(int startRow, int startColumn){
        while (!isBoardFilled()) {
            for (int i = startRow; i < chessBoard.length; i++) {
                for (int j = startColumn; j < chessBoard[i].length; j++) {
                    if (isCellEmpty(i, j)) {
                        fillCell(i, j);
                    }
                }
            }
            startRow = 0;
            startColumn = 0;
        }
    }

    public void placeEightQueens() {
        int startRow = 0;
        int startCol = 0;

        while (countQueensPosition() != 8){
            placeQueens(startRow,startCol);
            if(countQueensPosition() == 8) return;
        }
    }

    public int countQueensPosition(){
        int count = 0;
        for (char[] chars : chessBoard) {
            for (char aChar : chars) {
                if (aChar == 'Q') {
                    count++;
                }
            }
        }
        return count;
    }

    public void fillCell(int rowNumber, int colNumber){

        int rowPlusCol = rowNumber + colNumber;
        for (int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard[i].length ; j++) {
                boolean isDiagonal = (rowNumber - i == colNumber - j) || (rowPlusCol == (i+j));
                boolean isSameRowOrColumn = rowNumber == i || colNumber == j;
                if(isDiagonal || isSameRowOrColumn) chessBoard[i][j] = 'X';
            }
        }
        chessBoard[rowNumber][colNumber] = 'Q';
    }

    public boolean isBoardFilled(){
        for (char[] chars : chessBoard) {
            for (char aChar : chars) {
                if (aChar == 0) return false;
            }
        }
        return true;
    }

    public char[][] getChessBoard() {
        return chessBoard;
    }

    public String displayBoard(){
        StringBuilder board = new StringBuilder();
        board.append("-".repeat(33)).append("\n");
        for (char[] row : getChessBoard()){
            board.append("|");
            for (char col : row){
                if(col == '\u0000')
                board.append(String.format("%2c", ' ')).append(" |");
                else
                board.append(String.format("%2c", col)).append(" |");
            }
            board.append("\n").append("-".repeat(33)).append("\n");
        }
        return board.toString();
    }

    public boolean isCellEmpty(int rowNumber, int colNumber) {
        return chessBoard[rowNumber][colNumber] == '\u0000';
    }

    public void resetBoard(){
        chessBoard = new char[8][8];
    }


}
