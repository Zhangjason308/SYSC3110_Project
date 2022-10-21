import java.util.ArrayList;

public class Game {
    final static String[] ALPHABET = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    final static int[] POINTS = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    final static int[] NUMBER_OF_EACH = {9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};

    // need to create a bag of scrabble letters with appropriate pieces

    /*
    2 blank tiles (scoring 0 points)
    1 point: E ×12, A ×9, I ×9, O ×8, N ×6, R ×6, T ×6, L ×4, S ×4, U ×4
    2 points: D ×4, G ×3
    3 points: B ×2, C ×2, M ×2, P ×2
    4 points: F ×2, H ×2, V ×2, W ×2, Y ×2
    5 points: K ×1
    8 points: J ×1, X ×1
    10 points: Q ×1, Z ×1
    */

    public static void main(String args[]){
        Bag letters = new Bag(ALPHABET, NUMBER_OF_EACH);

        /*
        for (Piece p : letters.letterBag) {
            System.out.println(p.letter);
        }
        */

        /*
        Piece p = letters.grabPiece();

        ArrayList<Piece> ps = letters.grabPiece(4);

        System.out.println(p.letter);

        for (Piece piece : ps) {
            System.out.print(piece.letter);
        }
        */
        ArrayList<Piece> ps = letters.grabPiece(50);
        String out = letters.toString();
        System.out.println(out);

        /*
        for (Piece piece : ps) {
            System.out.print(piece.letter);
        }*/

    }

}
