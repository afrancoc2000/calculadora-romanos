package co.com.ceiba.calculadora.test;

import co.com.ceiba.calculadora.Romano;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ana.franco on 19/10/2015.
 */
public class RomanoTest {

    @Test
    public void nextDeIDevuelveV(){
        assertEquals("next de I no devuelve V", Romano.V, Romano.I.next());
    }

    @Test
    public void prevDeVDevuelveI(){
        assertEquals("prev de V no devuelve I", Romano.I, Romano.V.prev());
    }

    @Test
    public void esUnidadMediaVDevuelveTrue(){
        Boolean esMedia = Romano.V.esUnidadMedia();
        assertTrue("No es unidad media", esMedia);
    }

    @Test
    public void esPrevioIdeXDevuelveTrue(){
        Boolean esPrevio = Romano.X.esPrevio(Romano.I);
        assertTrue("No es previo", esPrevio);
    }


}
