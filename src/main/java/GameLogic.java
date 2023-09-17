import handmoves.Handmoves;
import player.Player;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GameLogic {

    //includes the relation between handmoves
    private List<String> handmoveRules;
    private static Game game;

    private GameLogic(Game game){
        this.game = game;
        this.handmoveRules = getHandmoveRules();

        Player playerA = game.getPlayerList().get(0);
        Player playerB = game.getPlayerList().get(1);

        for (int i = 0; i < game.getNumberOfRounds(); i++) {
            fight(playerA, playerB);
        }

    }

    private void fight(Player playerA, Player playerB) {
        Handmoves moveA = playerA.getHandmove();
        Handmoves moveB = playerB.getHandmove();






    }

    private List<String> getHandmoveRules(){
        /*try {
            return Files.readAllLines(Paths.get("src/main/java/handmoves/rules.txt"));
        } catch (IOException e) {
            System.err.println("Failed to read the file: " + e.getMessage());
            e.printStackTrace();
        }
        return List.of();

         */
        List<String> rules = new ArrayList<>();
        rules.add("Rock defeats Scissors");
        rules.add("Scissors defeats Paper");
        rules.add("Paper defeats Rock");

        return rules;
    }

    public static GameLogic createGameLogic(Game game){
        return new GameLogic(game);
    }


    private static String[] splitLine(String line){
        return line.split(" ");
    }

    private static boolean filterPlayerAHandmove(String[] lineParts){
        return lineParts[0].equals(game.getPlayerList().get(0));
    }

    private static String getPlayerAMove(String[] lineParts){
        return lineParts[0];
    }

    private static String isStrongAgainst(String[] lineParts){
        return lineParts[2];
    }

}
