package player;

import handmoves.Handmoves;

//This player chooses random moves
public class ChoosingRandomPlayer implements Player{
    private Handmoves move;

    public Handmoves getHandmove(){
        return move;
    }

    public Player createPlayer(){
        return new ChoosingRandomPlayer();
    }
}
