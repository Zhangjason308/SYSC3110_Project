import java.util.*;

public class Hand{

    String piece;
    ArrayList<Piece> hand;

    public Hand(){
        hand = new ArrayList<Piece>(7);
    }

    public int piecesRemaining(){
        return this.hand.size();
    }
    public void addPiece(Piece piece){
        if(hand.size() <= 7){
            this.hand.add(piece);
        }

    }
    public ArrayList<Piece> getHandPieces(){
        return this.hand;
    }

    public void addPieces(ArrayList<Piece> arr) {
        if(piecesRemaining()<=7){  // check before pushing that this is an ok change
            for(Piece p : arr){
                this.hand.add(p);
            }
        }
    }

    public void removePiece(Piece piece){
        hand.remove(piece);
    }

    public void printHand(){
        for (Piece p : hand){
            System.out.println(p.getLetter());
        }
    }



    public static void main(String args[]) {
        Hand h = new Hand();
        ArrayList<Piece> pi = new ArrayList<>();
        Piece p = new Piece("U");
        Piece p1 = new Piece("Q");
        Piece p2= new Piece("B");
        Piece p3= new Piece("N");

        pi.add(p);
        pi.add(p1);
        pi.add(p2);
        pi.add(p3);
        /*
        h.addPiece(p);
        h.addPiece(p1);
        h.addPiece(p2);
        h.addPiece(p3);
        h.addPiece(p);
        h.addPiece(p2);*/

        h.addPieces(pi);

        h.printHand();

    }

}
