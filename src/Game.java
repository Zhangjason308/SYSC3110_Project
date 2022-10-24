import java.util.ArrayList;

public class Game {
    final static String[] ALPHABET = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    final static int[] POINTS = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    final static int[] NUMBER_OF_EACH = {9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
    private Parser parser;
    int player1Score;
    int player2Score;  //p possibly want to add a player class since each player has a hand and a score, might make it more complicated tho, idk yet
    Hand player1Hand;
    Hand player2Hand;
    Board scrabbleBoard;
    Bag pieceBag;

    boolean player1turn; // false meaning its player2's turn


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
    public Game(){
        // initializing game elements
        player1Score = 0;
        player2Score = 0;
        player1Hand = new Hand();
        player2Hand = new Hand();
        scrabbleBoard = new Board();
        pieceBag = new Bag(ALPHABET, NUMBER_OF_EACH);// making the bag with the appropriate amount of each piece
        player1Hand.addPieces(pieceBag.grabPiece(7));
        player2Hand.addPieces(pieceBag.grabPiece(7));// fills each hand with 7 random pieces from the bag
        player1turn = true;
        parser = new Parser();
    }
    public void nextTurn(){
        player1turn = !player1turn;
    }
    public void refillHand(Hand hand){
        int num = 7 - hand.piecesRemaining(); //should prob make a constant for num 7
        ArrayList<Piece> piecesToAdd = pieceBag.grabPiece(num);
        for(int i = 0; i < num; i++){
            hand.addPiece(piecesToAdd.get(i));
        }
    }
    private void swap(String inputWord){ //need to add logic to switch turns if
        //parse input word for each letter with coordinate, then parse for each individual entity
        // then pulls some pieces from bag and stores it in tmep arraylist()
        // then adds those pieces to player hand depending on variable player1turn = true or false
        System.out.println("swap ran");
    }
    private void skip(){ //need to add logic to switch turns


        System.out.println("skip ran");
    }
    private void put(String inputWord){ //need to add logic to switch turns if valid
        System.out.println("put ran");
    }
    private void help(){
        System.out.println(parser.getCommands());
    }
    private boolean quit(Command command)
    {
        if(command.hasInputWord()) {
            System.out.println("Command unrecognized, if you are trying to quit game, type 'quit'");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }
        String commandWord = command.getCommandWord();
        String inputWord = command.getInputWord();

        switch (commandWord) {
            case "swap" -> {
                System.out.println(inputWord);
                swap(inputWord);
            }
            case "skip" -> {
                System.out.println(inputWord);
                skip();
            }
            case "put" -> {  //update board in put()
                System.out.println(inputWord);
                put(inputWord);
            }
            case "help" -> {
                System.out.println(inputWord);
                help();
            }
            case "quit" -> {
                System.out.println(inputWord);
                wantToQuit = quit(command);
            }
        }
        // else command not recognised.
        return wantToQuit;
    }

    public static void main(String[] args){
        Game scrabble = new Game();
        boolean finished = false;
        while (!finished) {
            Command command = scrabble.parser.getCommand();
            finished = scrabble.processCommand(command);
        }
        System.out.println("you quit the game");
    }
}
s