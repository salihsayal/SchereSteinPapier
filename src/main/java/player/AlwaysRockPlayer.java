package player;

import handmoves.Handmoves;

//This player chooses always Paper
public class AlwaysRockPlayer implements Player {

    public int scoreWin = 0;
    public int scoreDraw = 0;

    private Handmoves move;

    public Handmoves getHandmove() {
        return Handmoves.ROCK;
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
