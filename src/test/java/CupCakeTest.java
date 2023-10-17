import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupCakeTest {

    CupCake vanilla;
    CupCake strawberry;
    CupCake chocolate;


    @BeforeEach
    void setUp() {
        vanilla = new CupCake("Vanilla", "Vanilla", true, true);
        vanilla.addFillings("Vanilla Cream");
        strawberry = new CupCake("Strawberry", "Berry", false, true);
        strawberry.addFillings("Berry Jam");
        chocolate = new CupCake("Chocolate", "Chocolate", false, true);
        chocolate.addFillings("Whipped Chocolate");
    }


        @Test
        void checkAddFillings(){
        assertThat(strawberry.checkHasFilling()).isEqualTo("Berry Jam");
    }

}
