package patterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaBuilderTest {

    private SalaBuilder salaBuilder;

    @BeforeEach
    void before(){
        salaBuilder = new SalaBuilder("1", "sala0053D", 45);
    }

    @Test
    void testBuilder(){
        salaBuilder.descripcion("sala0010");
        salaBuilder.numero(50);
        assertEquals("sala0010", salaBuilder.build().getDescripcion());
        assertEquals(50, salaBuilder.build().getNumeroAsientos());
    }
}