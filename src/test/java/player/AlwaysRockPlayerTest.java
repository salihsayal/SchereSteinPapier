package player;

import handmoves.Handmoves;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlwaysRockPlayerTest {

    @Test
    @DisplayName("Check, if AlwaysRockPlayer's move is always Rock")
    void test_getHandmoveTest(){
        Player player = new AlwaysRockPlayer();
        Handmoves move = player.getHandmove();
        assertThat(move).isEqualTo(Handmoves.ROCK);

    }

}
