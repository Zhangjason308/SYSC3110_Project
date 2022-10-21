import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bag {
    ArrayList<Piece> letterBag;

    public Bag(String[] letters, int[] numOfEachLetter){
        letterBag = new ArrayList<Piece>();
        ArrayList<Piece> uniquePieces = new ArrayList<Piece>();
        int i = 0;
        for(String c : letters){  // makes each letter in the alphabet into a piece and add it to an arrayList
            uniquePieces.add(new Piece(c));
            i++;
        }
        i = 0;
        for (Piece p : uniquePieces) {  // adds the appropriate amount of each letter as a piece to the letter bag
            int numToAdd = numOfEachLetter[i];
            while(numToAdd > 0){
                letterBag.add(uniquePieces.get(i));
                numToAdd--;
            }
            i++;
        }
        // Collections.shuffle(letterBag); the grab function pulls from a random index so randomizing the bag can be optional
    }
    public int remainingLetters(){
        return letterBag.size();
    }

    public Piece grabPiece(){  //returns a random piece and removes that piece from this bag
        Random random = new Random();
        int randIndex = random.nextInt(remainingLetters());
        Piece toReturn = letterBag.get(randIndex);
        letterBag.remove(randIndex);
        return toReturn;
    }
    public ArrayList<Piece> grabPiece(int number){  //returns a random piece and removes that piece from this bag
        Random random = new Random();
        ArrayList<Piece> pieces = new ArrayList<Piece>();  // need to limit number upto 7
        for (int i =0; i < number; i++){
            int randIndex = random.nextInt(remainingLetters());
            Piece toReturn = letterBag.get(randIndex);
            pieces.add(toReturn);
            letterBag.remove(randIndex);
        }
        return pieces;
    }

    public String toString(){
        ArrayList<Piece> letters = letterBag;
        String bagString = "";
        Piece lastPiece = null;
        int numOf = 0;
        for (Piece p : letters) {
            if(lastPiece == null){
                numOf++;
                lastPiece = p;
                continue;
            }
            if(lastPiece.getLetter() == p.getLetter()){
                numOf++;
            }
            else{
                bagString += lastPiece.getLetter() + ": " + numOf + "\n";
                numOf = 1;
            }
            lastPiece = p;
        }
        return bagString;
    }
/*
    public ArrayList<Piece> Swap(ArrayList<Piece> p){

    }*/
}
