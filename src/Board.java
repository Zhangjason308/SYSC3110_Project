public class Board {
        Piece[][] arr;
        class placedPiece{
            static int x;
            static int y;
        };
        class firstLetter{
            static int x;
            static int y;
        }
        class word{
            static String x;
            static String y;
        }

    public Board(){
        arr = new Piece[15][15]; //Change to Element After, and once changed to type PIECE, every element will be null
    }

    public Piece getPiece(int x, int y) {
        return arr[x][y];
    }

    public void placePiece(int x, int y, Piece E) {
        arr[x][y] = E;
        placedPiece.x = x;
        placedPiece.y = y;
    }

    public int getWords() {
            word.x = "";
            word.y = "";
        //Check vertical word
        firstLetter.x = placedPiece.x;
        firstLetter.y = placedPiece.y;
        while (arr[firstLetter.x][firstLetter.y] != null) {
            firstLetter.y++;
        }
        firstLetter.y--;
        while(arr[firstLetter.x][firstLetter.y] != null) {
            word.y+=arr[firstLetter.x][firstLetter.y].getLetter();
            firstLetter.y--;
        }
        word.y.toLowerCase();

        //Check horizontal word
        firstLetter.x = placedPiece.x;
        firstLetter.y = placedPiece.y;
        while (arr[firstLetter.x][firstLetter.y] != null) {
            firstLetter.x--;
        }
        firstLetter.x++;
        while(arr[firstLetter.x][firstLetter.y] != null) {
            word.x +=arr[firstLetter.x][firstLetter.y].getLetter();
            firstLetter.x++;
        }
        word.x.toLowerCase();


        if (word.y.length() == 1) {
            word.y = "";
        }
        if (word.x.length() == 1) {
            word.x = "";
        }

        return 1;
    }

    public static void main(String args[]) {
        Board board1 = new Board();
        Piece t = new Piece("T");
        Piece h = new Piece("H");
        Piece e = new Piece("E");
        board1.placePiece(1,1,t);
        board1.placePiece(2,1,h);
        board1.placePiece(3,1,e);
        board1.getWords();
        System.out.println("Horizontal Word: " + word.x);
        System.out.println("Vertical Word: " + word.y);
    }
}
//hello
