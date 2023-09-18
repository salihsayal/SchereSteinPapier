package player;

import handmoves.Handmoves;

import java.util.ArrayList;
import java.util.List;

//This player chooses random moves
public class ChoosingRandomPlayer implements Player {
    private Handmoves move;

    public int scoreWin = 0;
    public int scoreDraw = 0;

    public Handmoves getHandmove() {
        return randomMove();
    }

    private Handmoves randomMove() {
        List<Handmoves> allHandmoves = getAllHandmoves();
        return allHandmoves.get(getRandomNumber(Handmoves.values().length, 0));
    }

    //Creates a list with all Handmoves
    private List<Handmoves> getAllHandmoves() {
        List<Handmoves> moves = new ArrayList<>();
        for (Handmoves move : Handmoves.values()) {
            moves.add(move);
        }
        return moves;
    }

    private int getRandomNumber(int max, int min) {
        return (int) (Math.random() * (max) + min);
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
