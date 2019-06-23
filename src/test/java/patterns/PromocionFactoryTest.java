package patterns;

import entities.Promocion;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PromocionFactoryTest {

    private static PromocionFactory promocionFactory;
    private static Promocion promocion;

    @BeforeAll
    static void before() {
        promocionFactory = promocionFactory.getPromocionFactory();
        promocion = new Promocion("1", "Rebajas 5%", true);
    }

    @Test
    void testGetPromocion(){
        promocionFactory.setPromocion(promocion);
        Promocion promocionReview = promocionFactory.getPromocion("1");
        assertEquals("1", promocionReview.getId());
        assertEquals("Rebajas 5%", promocionReview.getDescripcion());
        assertEquals(true, promocionReview.getEstado());
    }

    @Test
    void testRemoveView(){
        promocionFactory.setPromocion(promocion);
        promocionFactory.removePromocion("1");
        assertNull(promocionFactory.getPromocion("1"));
    }

}
