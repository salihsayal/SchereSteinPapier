import player.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Player playerA = new AlwaysPaperPlayer();
        Player playerB = new ChoosingRandomPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 100);
        game.run();
        System.out.println(game.toString());


    }
}
