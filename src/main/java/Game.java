import player.Player;

import java.io.IOException;
import java.util.List;

public class Game {
    List<Player> playerList;

    int numberOfRounds;

    private Game(List<Player> playerList, int numberOfRounds) {
        this.playerList = playerList;
        this.numberOfRounds = numberOfRounds;
    }

    public void run() {
        GameLogic gameLogic = GameLogic.createGameLogic(this);

    }

    public List<Player> getPlayerList() {
        return this.playerList;
    }

    public Player getPlayerA(){
        return this.playerList.get(0);
    }

    public Player getPlayerB(){
        return this.playerList.get(1);
    }


    public int getNumberOfRounds() {
        return this.numberOfRounds;
    }

    public static Game createGame(List<Player> playerList, int numberOfRounds) {
        return new Game(playerList, numberOfRounds);
    }

    @Override
    public String toString(){
        return "Spieler A gewinnt "+ getPlayerA().getScore() + " von "+getNumberOfRounds()+" Spielen\n" +
                "Spieler B gewinnt "+ getPlayerB().getScore() + " von "+getNumberOfRounds()+ " Spielen\n" +
                "Unentschieden: "+getPlayerA().getScoreDraw()+" von "+ getNumberOfRounds()+ " Spielen";
    }

}
