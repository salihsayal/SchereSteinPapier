package player;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PlayerTest {

    @Test
    @DisplayName("Check, if score of won games is 2")
    void test_scoreWin(){
        Player player = new AlwaysScissorsPlayer();
        player.scoreInc();
        player.scoreInc();
        assertThat(player.getScore()).isEqualTo(2);
    }
    @Test
    @DisplayName("Check, if score of won games is 2")
    void test_scoreDraw(){
        Player player = new AlwaysScissorsPlayer();
        player.scoreDraw();
        player.scoreDraw();
        assertThat(player.getScoreDraw()).isEqualTo(2);
    }
}
