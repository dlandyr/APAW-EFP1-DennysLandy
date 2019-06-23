package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromocionTest {

    private Promocion promocion;

    @BeforeEach
    void before() {
        promocion = new Promocion("1", "Rebajas 5%", true);
    }

    @Test
    void testDatosPromocion(){
        assertEquals("1", promocion.getId());
        assertEquals("Rebajas 5%", promocion.getDescripcion());
        assertEquals(true, promocion.getEstado());
    }

    @Test
    void testEstadoFalse(){
        promocion.setEstado(false);
        assertEquals(false, promocion.getEstado());
    }

    @Test
    void testDescripcion(){
        promocion.setDescripcion("Rebajas 25%!");
        assertEquals("Rebajas 25%!", promocion.getDescripcion());
    }
}
