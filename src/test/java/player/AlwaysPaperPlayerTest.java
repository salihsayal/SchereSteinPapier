package player;

import handmoves.Handmoves;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlwaysPaperPlayerTest {

    @Test
    @DisplayName("Check, if AlwaysPaperPlayer's move is always Paper")
    void test_getHandmoveTest(){
        Player player = new AlwaysPaperPlayer();
        Handmoves move = player.getHandmove();
        assertThat(move).isEqualTo(Handmoves.PAPER);

    }




}
