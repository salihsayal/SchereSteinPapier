package player;

import handmoves.Handmoves;

public interface Player {
    public Handmoves getHandmove();
    public Player createPlayer();

}
