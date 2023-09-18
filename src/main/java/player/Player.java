package player;

import handmoves.Handmoves;

public interface Player {
    public Handmoves getHandmove();

    //increases the score of player by 1
    public void scoreInc();

    public int getScore();

    public int getScoreDraw();

    //increases the amount of draws by 1
    public void scoreDraw();


}
