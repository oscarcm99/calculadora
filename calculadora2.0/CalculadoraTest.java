

import static org.junit.Assert.*;//Librerias de la clase de prueba
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class CalculadoraTest.
 *
 * @author  (Sergio Sanz, Oscar Calderon)
 * @version (calculadora 2.0)
 */
public class CalculadoraTest
{
    /**
     * Default constructor for test class CalculadoraTest
     */
    Calculadora calculadora;


    public CalculadoraTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        calculadora = new Calculadora();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        System.out.println("Las pruebas se han acabado.");
    }
    @Test
    public void suma(){
        calculadora.ponNum1(1);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(5, calculadora.dameResultado());
        calculadora.ponNum1(-1);
        calculadora.ponNum2(-2);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(-3, calculadora.dameResultado());
        calculadora.ponNum1(5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(5, calculadora.dameResultado());
    }
    public void resta(){
        calculadora.ponNum1(2);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(-3, calculadora.dameResultado());
    }
    /*public void multiplicacion(){
    }
    public void division(){
    }
    public void raices(){
    }
    public void potencias(){
    }
    public void factoriales(){
    }
    public void logaritmos(){
    }*/
}
