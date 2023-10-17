import com.sun.source.tree.UsesTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bntaBakery;
    CupCake vanilla;
    CupCake strawberry;
    CupCake chocolate;
    TieredCake tieredCake;

    @BeforeEach
    setUp() {
        bntaBakery = new Bakery("BNTA Bakery", 0, 0);
        vanilla = new CupCake("Vanilla", "Vanilla", true, true);
        strawberry = new CupCake("Strawberry", "Berry", false, true);
        chocolate = new CupCake("Chocolate", "Chocolate", false, true);
        tieredCake = new TieredCake("Vanilla Tiered", "Vanilla", false, true);
        tieredCake = new TieredCake("Chocolate Tiered", "Chocolate", false, true);



    }

    public Bakery getBntaBakery() {
        return bntaBakery;
    }

    @Test
    void checkAddFillings(){
        assertThat(stock.checkStock()).isEqualTo("Vanilla");
    }

    @Test
    public void hasName() {
        assertThat(bntaBakery.getName()).isEqualTo("BNTA Bakery");
    }
}
