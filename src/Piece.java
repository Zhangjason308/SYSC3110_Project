/**
 *Class Piece is a piece/character that will be selected to be placed on the board.
 *
 */
public class Piece {

    String piece;

    /**
     *
     * @param piece
     */
    public Piece(String piece){
        this.piece = piece;
    }

    /**
     *
     * @return Returns the points of the entered character.
     */
    public int piecePoint(){

        if (piece.equals("E")){
            return 1;
        } else if (piece.equals("A")){
            return 1;
        } else if (piece.equals("I")){
            return 1;
        } else if (piece.equals("O")){
            return 1;
        } else if (piece.equals("N")){
            return 1;
        } else if (piece.equals("R")){
            return 1;
        } else if (piece.equals("T")){
            return 1;
        } else if (piece.equals("L")){
            return 1;
        } else if (piece.equals("S")){
            return 1;
        } else if (piece.equals("U")){
            return 1;
        } else if (piece.equals("D")){
            return 2;
        } else if (piece.equals("G")){
            return 2;
        } else if (piece.equals("B")){
            return 3;
        } else if (piece.equals("C")){
            return 3;
        } else if (piece.equals("M")){
            return 3;
        } else if (piece.equals("P")){
            return 3;
        } else if (piece.equals("F")){
            return 4;
        } else if (piece.equals("H")){
            return 4;
        } else if (piece.equals("V")){
            return 4;
        } else if (piece.equals("W")){
            return 4;
        } else if (piece.equals("Y")){
            return 4;
        } else if (piece.equals("K")){
            return 5;
        } else if (piece.equals("J")){
            return 8;
        } else if (piece.equals("X")){
            return 8;
        } else if (piece.equals("Q")){
            return 10;
        } else if (piece.equals("Z")){
            return 10;
        }
        else return 0;
}

    public String getLetter(){

        return piece;
    }


    public static void main(String args[]) {
        Piece p = new Piece("Q");
        Piece p1 = new Piece("A");
        System.out.println(p.getLetter());
        System.out.println("SCORE for p: "+ p.piecePoint());
        System.out.println("SCORE for p1: "+p1.piecePoint());

    }
    }

