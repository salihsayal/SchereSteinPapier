package player;

import handmoves.Handmoves;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlwaysScissorsPlayerTest {

    @Test
    @DisplayName("Check, if AlwaysScissorsPlayer's move is always Scissors")
    void test_getHandmoveTest() {
        Player player = new AlwaysScissorsPlayer();
        Handmoves move = player.getHandmove();
        assertThat(move).isEqualTo(Handmoves.SCISSORS);

    }

}
