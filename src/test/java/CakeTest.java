import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {

    Cake cake;

    @BeforeEach
    void setUp(){
        cake = new CupCake("Vanilla", "Vanilla", true, true );

    }

    @Test
    void checkHasFruit(){
        assertThat(cake.hasFruit()).isEqualTo(true);
    }


    @Test
    void checkHasIcing(){
        assertThat(cake.hasIcing()).isEqualTo(true);
    }

}
