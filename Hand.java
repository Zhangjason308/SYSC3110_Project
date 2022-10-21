import java.util.*;

public class Hand{

    String piece;
    ArrayList<Piece> hand;

    public Hand(){
        super();

        hand = new ArrayList<Piece>(7);

    }

    public void addPiece(Piece piece){
        hand.add(piece);
    }

    public void removePiece(Piece piece){
        hand.remove(piece);
    }

    public String printPiece(){

        return piece;
    }
    public void printHand(){
        for (Piece p : hand){
            System.out.println(p.printPiece());
        }
    }



    public static void main(String args[]) {
        Hand h = new Hand();
        Piece p = new Piece("U");
        Piece p1 = new Piece("Q");
        Piece p2= new Piece("B");
        Piece p3= new Piece("N");

        h.addPiece(p);
        h.addPiece(p1);
        h.addPiece(p2);
        h.addPiece(p3);
        h.addPiece(p);
        h.addPiece(p2);


        h.printHand();


    }

}
