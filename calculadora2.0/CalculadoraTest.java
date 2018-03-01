

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
    }
    @Test
    public void suma(){
        //Caso 1 suma
        calculadora.ponNum1(1);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(5, calculadora.dameResultado());
        //Caso 2 suma
        calculadora.ponNum1(-1);
        calculadora.ponNum2(-2);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(-3, calculadora.dameResultado());
        //Caso 3 suma
        calculadora.ponNum1(5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(5, calculadora.dameResultado());
        //Caso 4 suma
        calculadora.ponNum1(5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(5, calculadora.dameResultado());
        
    }
    @Test
    public void resta(){
        //Caso 1 resta
        calculadora.ponNum1(2);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(-2, calculadora.dameResultado());
        //Caso 2 resta
        calculadora.ponNum1(4);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(2, calculadora.dameResultado());
        //Caso 3 resta
        calculadora.ponNum1(4);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(4, calculadora.dameResultado());
        //Caso 4 resta
        calculadora.ponNum1(0);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(-4, calculadora.dameResultado());
    }
    @Test
    public void multiplicacion(){
        //Caso 1 multiplicacion
        calculadora.ponNum1(3);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(15, calculadora.dameResultado());
        //Caso 2 multiplicacion
        calculadora.ponNum1(5);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(15, calculadora.dameResultado());
        //Caso 3 multiplicacion
        calculadora.ponNum1(0);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(0, calculadora.dameResultado());
        //Caso 4 multiplicacion
        calculadora.ponNum1(5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(0, calculadora.dameResultado());
    }
    @Test
    public void division(){
        //Caso 1 division
        calculadora.ponNum1(4);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(2, calculadora.resultadoReal(),0);
        //Caso 2 division
        calculadora.ponNum1(2);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(0.5, calculadora.resultadoReal(),0);
        //Caso 3 division
        calculadora.ponNum1(0);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0);
        //Caso 4 division
        calculadora.ponNum1(5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0);
        
    }
    /*
    public void raices(){
    }
    public void potencias(){
    }
    public void factoriales(){
    }
    public void logaritmos(){
    }*/
}
