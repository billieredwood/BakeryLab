import com.sun.source.tree.UsesTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bntaBakery;
    CupCake vanilla;
    CupCake strawberry;
    CupCake chocolate;
    Cake cake;
    TieredCake vanillaTieredCake;
    TieredCake chocolateTieredCake;


    @BeforeEach
    setUp() {
        bntaBakery = new Bakery("BNTA Bakery", 0, 0);
        vanilla = new CupCake("Vanilla", "Vanilla", true, true);
        strawberry = new CupCake("Strawberry", "Berry", false, true);
        chocolate = new CupCake("Chocolate", "Chocolate", false, true);
        vanillaTieredCake = new TieredCake("Vanilla Tiered", "Vanilla", false, true);
        chocolateTieredCake = new TieredCake("Chocolate Tiered", "Chocolate", false, true);

    }

    public Bakery getBntaBakery() {
        return bntaBakery;
    }

    @Test
    void checkAddFillings(){
        assertThat(cakeStock.checkStock()).isEqualTo("Vanilla");
    }

    @Test
    public void hasName() {
        assertThat(bntaBakery.getName()).isEqualTo("BNTA Bakery");
    }
}
