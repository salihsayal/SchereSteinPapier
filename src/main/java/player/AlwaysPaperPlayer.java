package player;

import handmoves.Handmoves;

//This player chooses always Paper
public class AlwaysPaperPlayer implements Player {

    private int scoreWin = 0;
    private int scoreDraw = 0;

    private Handmoves move;

    public Handmoves getHandmove() {
        return Handmoves.PAPER;
    }


    public void scoreInc() {
        scoreWin++;
    }

    public int getScore() {
        return scoreWin;
    }

    public void scoreDraw() {
        scoreDraw++;
    }

    public int getScoreDraw() {
        return scoreDraw;
    }


}
