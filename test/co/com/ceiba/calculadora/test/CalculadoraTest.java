package co.com.ceiba.calculadora.test;

import co.com.ceiba.calculadora.Calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void sumarUnoMasUno(){
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        String suma = calculadora.sumar("I", "I");

        // Assert
        assertEquals("La suma no da II", "II", suma);
    }

    @Test
    public void sumarTresMasUno(){
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        String suma = calculadora.sumar("III", "I");

        // Assert
        assertEquals("La suma no da IV", "IV", suma);

    }

    @Test
    public void sumarTresMasDosDaCinco(){
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        String suma = calculadora.sumar("III", "II");

        // Assert
        assertEquals("La suma no da V", "V", suma);

    }

    @Test
    public void sumarTresMasTresDaSeis(){
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        String suma = calculadora.sumar("III", "III");

        // Assert
        assertEquals("La suma no da VI", "VI", suma);

    }

    @Test
    public void sumar4Mas4Da8(){
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        String suma = calculadora.sumar("IV", "IV");

        // Assert
        assertEquals("La suma no da VIII", "VIII", suma);

    }

    @Test
    public void convertirIVenIIII(){
        Calculadora calculadora = new Calculadora();
        String numeroConvertido = calculadora.convertirRestasASumas("IV");
        // Assert
        assertEquals("El número convertido no da IIII", "IIII", numeroConvertido);
    }

    @Test
    public void convertirXIXenXVIIII(){
        Calculadora calculadora = new Calculadora();
        String numeroConvertido = calculadora.convertirRestasASumas("XIX");
        // Assert
        assertEquals("El número convertido no da XVIIII", "XVIIII", numeroConvertido);
    }


}
