package player;

import handmoves.Handmoves;

//This player chooses always Paper
public class AlwaysScissorsPlayer implements Player{

    private Handmoves move;
    public int scoreWin = 0;
    public int scoreDraw = 0;

    public Handmoves getHandmove(){
        return Handmoves.SCISSORS;
    }
    public void scoreInc(){
        scoreWin++;
    }
    public int getScore(){return scoreWin;}

    public void scoreDraw(){ scoreDraw++; }
    public int getScoreDraw(){return scoreDraw;}





}
