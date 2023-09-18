import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import handmoves.Handmoves;
import player.Player;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;


import com.google.common.collect.Multimap;

public class GameLogic {

    //includes the relation between handmoves
    private Multimap<String, String> handmoveRules;
    private static Game game;

    private GameLogic(Game game) {
        this.game = game;
        this.handmoveRules = getHandmoveRules();

        for (int i = 0; i < game.getNumberOfRounds(); i++) {
            fight(game.getPlayerA(), game.getPlayerB());
        }

    }

    private void fight(Player playerA, Player playerB) {
        Handmoves moveA = playerA.getHandmove();
        Handmoves moveB = playerB.getHandmove();


        if (handmoveRules.containsEntry(moveA.toString(), moveB.toString())) {
            playerA.scoreInc();
            return;
        }
        if (handmoveRules.containsEntry(moveB.toString(), moveA.toString())) {
            playerB.scoreInc();
            return;
        }
        playerA.scoreDraw();
        playerB.scoreDraw();


    }

    private Multimap<String, String> getHandmoveRules() {
        /*try {
            return Files.readAllLines(Paths.get("src/main/java/handmoves/rules.txt"));
        } catch (IOException e) {
            System.err.println("Failed to read the file: " + e.getMessage());
            e.printStackTrace();
        }
        return List.of();

         */
        List<String> rules = new ArrayList<>();
        rules.add("ROCK defeats SCISSORS");
        rules.add("SCISSORS defeats PAPER");
        rules.add("PAPER defeats ROCK");



        ListMultimap<String, String> ruleMultimap = ArrayListMultimap.create();
        rules.stream()
                .map(rule -> rule.split(" defeats "))
                .forEach(ruleParts -> {
                    String key = ruleParts[0];
                    String value = ruleParts[1];
                    ruleMultimap.put(key, value);
                });

        return ruleMultimap;

    }

    public static GameLogic createGameLogic(Game game) {
        return new GameLogic(game);
    }


}
