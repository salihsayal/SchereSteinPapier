package player;

import handmoves.Handmoves;

//This player chooses always Paper
public class AlwaysPaperPlayer implements Player{

    private Handmoves move;

    public Handmoves getHandmove(){
        return Handmoves.PAPER;
    }




}
