import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class TieredCake{
    TieredCake tieredCake;

    @BeforeEach
    void setUp(){
        tieredCake = new TieredCake("Tiered Cakes", "Vanilla or Chocolate", false, true );


    @Test
    void checkTierTotal(){
        assertThat(tieredCake.tierTotal).isEqualTo(3);
    }
}
