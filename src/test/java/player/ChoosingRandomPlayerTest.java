package player;

import handmoves.Handmoves;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChoosingRandomPlayerTest {
    @Test
    @DisplayName("Check, if ChoosingRandomPlayer is choosing randomly Paper")
    void ChoosingRandomPlayerTest_getHandmovePaperTest(){
        Player player = new ChoosingRandomPlayer();
        int a= 0;
        boolean contains = false;
        while(a < 100){
            Handmoves moves = player.getHandmove();
            if (moves.equals(Handmoves.PAPER)){
                contains = true;
                break;
            }
            a++;
        }

        assertThat(contains).isTrue();

    }

    @Test
    @DisplayName("Check, if ChoosingRandomPlayer is choosing randomly Rock")
    void ChoosingRandomPlayerTest_getHandmoveRockTest(){
        Player player = new ChoosingRandomPlayer();
        int a= 0;
        boolean contains = false;
        while(a < 100){
            Handmoves moves = player.getHandmove();
            if (moves.equals(Handmoves.ROCK)){
                contains = true;
                break;
            }
            a++;
        }
        assertThat(contains).isTrue();

    }

    @Test
    @DisplayName("Check, if ChoosingRandomPlayer is choosing randomly Scissors")
    void ChoosingRandomPlayerTest_getHandmoveScissorsTest(){
        Player player = new ChoosingRandomPlayer();
        int a= 0;
        boolean contains = false;
        while(a < 100){
            Handmoves moves = player.getHandmove();
            if (moves.equals(Handmoves.SCISSORS)){
                contains = true;
                break;
            }
            a++;
        }
        assertThat(contains).isTrue();

    }
}
