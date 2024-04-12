import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
    @Test
    @DisplayName("Test Singleton Constructor")
    public void testSingletonConstructor() {
        int numeroAleatorio = 5;
        int numeroPropuesto = 10;
        int intentosMax = 15;
        int puntuacion = 20;
        String alias = "Test";
        int rondasPartida = 25;
        int rondaActual = 30;
        int fallos = 35;

        Singleton instance = new Singleton(numeroAleatorio, numeroPropuesto, intentosMax, puntuacion, alias, rondasPartida, rondaActual, fallos);

        assertEquals(numeroAleatorio, instance.getNumeroAleatorio());
        assertEquals(numeroPropuesto, instance.getNumeroPropuesto());
        assertEquals(intentosMax, instance.getIntentosMax());
        assertEquals(puntuacion, instance.getPuntuacion());
        assertEquals(alias, instance.getAlias());
        assertEquals(rondasPartida, instance.getRondasPartida());
        assertEquals(rondaActual, instance.getRondaActual());
        assertEquals(fallos, instance.getFallos());
    }

    @Test
    @DisplayName("Test que comprueba que la instancia es única")
    public void testSingletonGetInstance() {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        assertNotNull(firstInstance);
        assertNotNull(secondInstance);
        assertSame(firstInstance, secondInstance);
    }
}
