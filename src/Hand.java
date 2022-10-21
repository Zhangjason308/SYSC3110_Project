import java.util.*;

public class Hand{

    String piece;
    ArrayList<Piece> hand;

    public Hand(){

        hand = new ArrayList<Piece>(7);

    }

    public void addPiece(Piece piece){
        if(hand.size() < 7){
            hand.add(piece);
        }

    }

    public void addPieces(ArrayList<Piece> arr) {
        for(Piece p : arr){
            if(arr.size()<7){
                hand.add(p);
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
