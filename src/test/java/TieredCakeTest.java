import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class TieredCake{
    TieredCake vanillaTieredCake;
    TieredCake chocolateTieredCake;



    @BeforeEach
    void setUp(){
        vanillaTieredCake = new TieredCake("Tiered Vanilla", "Vanilla", false, true );
        vanillaTieredCake.addFillings("Vanilla Cream");
        chocolateTieredCake = new TieredCake("Chocolate", "Chocolate", false, true);
        chocolateTieredCake.addFillings("Whipped Chocolate");
    }

    @Test
    void addFillings(){
        assertThat(vanillaTieredCake.addFilling).isEqualTo("Vanilla");
    }
}
