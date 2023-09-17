import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import player.*;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

class GameTest {

    //Relation between Paper and Rock

    @Test
    @DisplayName("Test, if score of Paper Player is 70")
    void test_PaperAgainstRock(){
        Player playerA = new AlwaysPaperPlayer();
        Player playerB = new AlwaysRockPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 70);
        game.run();

        assertThat(playerA.getScore()).isEqualTo(70);

    }

    //Relation between Paper and Scissors

    @Test
    @DisplayName("Test, if score of Paper Player is 0")
    void test_PaperAgainstScissors(){
        Player playerA = new AlwaysPaperPlayer();
        Player playerB = new AlwaysScissorsPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 60);
        game.run();

        assertThat(playerA.getScore()).isEqualTo(0);

    }

    //Relation between Paper and Paper

    @Test
    @DisplayName("Test, if amount of draw of Paper Player is 50")
    void test_PaperAgainstPaper(){
        Player playerA = new AlwaysPaperPlayer();
        Player playerB = new AlwaysPaperPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 50);
        game.run();

        assertThat(playerA.getScoreDraw()).isEqualTo(50);

    }



    //Relation between Rock and Rock

    @Test
    @DisplayName("Test, if amount of draw of Rock Player is 40")
    void test_RockAgainstRock(){
        Player playerA = new AlwaysRockPlayer();
        Player playerB = new AlwaysRockPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 40);
        game.run();

        assertThat(playerA.getScoreDraw()).isEqualTo(40);

    }

    //Relation between Rock and Scissors

    @Test
    @DisplayName("Test, if score of Rock Player is 20")
    void test_RockAgainstScissors(){
        Player playerA = new AlwaysRockPlayer();
        Player playerB = new AlwaysScissorsPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 40);
        game.run();

        assertThat(playerA.getScore()).isEqualTo(40);

    }

    //Relation between Paper and Rock

    @Test
    @DisplayName("Test, if score of Paper Player is 70")
    void test_RockAgainstPaper(){
        Player playerA = new AlwaysPaperPlayer();
        Player playerB = new AlwaysRockPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 70);
        game.run();

        assertThat(playerB.getScore()).isEqualTo(0);

    }



    //Relation between Scissors and Rock

    @Test
    @DisplayName("Test, if score of Scissors Player is 0")
    void test_ScissorsAgainstRock(){
        Player playerA = new AlwaysScissorsPlayer();
        Player playerB = new AlwaysRockPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 80);
        game.run();

        assertThat(playerA.getScore()).isEqualTo(0);

    }

    //Relation between Scissors and Paper

    @Test
    @DisplayName("Test, if score of Scissors Player is 90")
    void test_ScissorsAgainstPaper(){
        Player playerA = new AlwaysScissorsPlayer();
        Player playerB = new AlwaysPaperPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 90);
        game.run();

        assertThat(playerA.getScore()).isEqualTo(90);

    }

    //Relation between Scissors and Scissors

    @Test
    @DisplayName("Test, if amount of draw of Scissors Player is 90")
    void test_ScissorsAgainstScissors(){
        Player playerA = new AlwaysScissorsPlayer();
        Player playerB = new AlwaysScissorsPlayer();
        List<Player> playerList = new ArrayList<>(List.of(playerA, playerB));

        Game game = Game.createGame(playerList, 90);
        game.run();

        assertThat(playerA.getScore()).isEqualTo(90);

    }



}
