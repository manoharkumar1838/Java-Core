package Oops;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
   public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("left, right, up, down, diagonal (by 1 step)");
    }
}