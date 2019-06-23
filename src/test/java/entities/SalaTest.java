package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaTest {

    private Sala sala;

    @BeforeEach
    void before(){ sala = new Sala("01", "sala0013D", 40);}

    @Test
    void testDatosSala(){
        assertEquals("01", sala.getId());
        assertEquals("sala0013D", sala.getDescripcion());
        assertEquals(40, sala.getNumeroAsientos());
    }

    @Test
    void testSetDescripcion(){
        sala.setDescripcion("sala002");
        assertEquals("sala002", sala.getDescripcion());
    }

    @Test
    void testSetNumeroAsietnos(){
        sala.setNumeroAsientos(50);
        assertEquals(50, sala.getNumeroAsientos());
    }
}
