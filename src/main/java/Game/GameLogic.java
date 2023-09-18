package Game;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import handmoves.Handmoves;
import player.Player;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.google.common.collect.Multimap;

public class GameLogic {

    //includes the relation between handmoves
    private Multimap<String, String> handmoveRules;
    private Game game;

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

    // turns the rules.txt file into a MultiMap.
    // The key is a handmove. The value of a key is a handmove, which is weak against the key,
    private Multimap<String, String> getHandmoveRules() {
        //List<String> rules = Files.readAllLines(Paths.get("src/main/java/handmoves/rules.txt"));

        List<String> rules = readRulesTXT();

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

    // reads the rules.txt file and adds the lines to a list
    private List<String> readRulesTXT() {
        List<String> rules = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get("src/main/java/handmoves/rules.txt"))) {
            rules = lines.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println(e);
            rules.addAll(List.of());
        }
        return rules;
    }

    public static GameLogic createGameLogic(Game game) {
        return new GameLogic(game);
    }


}
