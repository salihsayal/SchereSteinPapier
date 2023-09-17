import player.Player;

import java.io.IOException;
import java.util.List;

public class Game {
    List<Player> playerList;

    int numberOfRounds;
    private Game(List<Player> playerList, int numberOfRounds){
        this.playerList = playerList;
        this.numberOfRounds = numberOfRounds;
    }

    public void run() {
        GameLogic gameLogic = GameLogic.createGameLogic(this);

    }

    public List<Player> getPlayerList(){
        return this.playerList;
    }

    public int getNumberOfRounds(){
        return this.numberOfRounds;
    }

    public static Game createGame(List<Player> playerList, int numberOfRounds){
        return new Game(playerList, numberOfRounds);
    }

}
