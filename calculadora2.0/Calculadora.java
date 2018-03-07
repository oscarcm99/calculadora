/**
 * Calculadora de 2 numeros que suma, resta, multiplica, divide, hace raices, logaritmos, factoriales y potencias.
 *
 * @author (Sergio Sanz, Oscar Calderon)
 * @version (calculadora 2.0)
 */

public class Calculadora
{
    // instance variables - replace the example below with your own
    private double num1;
    private double num2;
    private int factorial;//Para los factoriales
    private double resultado;//Resultado para la raiz
    private int rdo;//Resultado factoriales
    private Operacion op; //Asociamos el enum creado en otra clase
    private int indice;
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        num1 = 0;
        num2 = 0;
        factorial = 0;
        indice = 0;
        op=op.SUMA;

    }

    public void ponNum1(double n1)
    {
        // put your code here
        this.num1=n1;
    }

    public void ponNum2(double n2)
    {
        // put your code here
        this.num2=n2;
    }
    public void PonFactorial(int factorial){
        //Factorial
        this.factorial=factorial;
    }
    public void PonIndice(int indice){
        //indice raiz
        this.indice=indice;
    }
    public void opera()
    {
        switch(op){
            case SUMA:
                resultado=num1+num2;
                break;
            case RESTA:
                resultado=num1-num2;
                break;
            case MULTIPLICA:
                resultado=num1*num2;
                break;
            case DIVIDE:
                resultado= num1/num2;
                break;
            case RAICES:
                resultado = (double)Math.pow(num1,1/num2); /*Asocia el resultado de la raiz al meter los numeros, un float que es el resultado que devuelve*/
                break;
            case POTENCIAS:
                resultado = (double)Math.pow(num1,num2);
                break;
            case LOGARITMOS:
                resultado=Math.log10(num1);
                break;
            case FACTORIALES:
                int a =1;  
                while ( factorial!=0) {
                    a=a*factorial;
                    factorial--;
                }
                rdo=a;
                break;
        }
    }
    public void ponOperacion(String opera){
        switch(opera){

            case "SUMA":
                op=op.SUMA;
                break;
            case "RESTA":
                op=op.RESTA;
                break;
            case "MULTIPLICA":
                op=op.MULTIPLICA;
                break;
            case "DIVIDE":
                op=op.DIVIDE;
                break;
            case "RAICES":
                op=op.RAICES;
                break;
            case "POTENCIAS":
                op=op.POTENCIAS;
                break;
            case "LOGARITMOS":
                op=op.LOGARITMOS;
                break;
            case "FACTORIALES":
                op=op.FACTORIALES;
                break;
        }
    }
    public double resultadoReal()
    {
        //devuelve un resultado de tipo double(raiz,logaritmos)
        return resultado;
    }
    public int resultado(){
        //devuelve un resultado entero para factoriales
        return rdo;
    }
    /*public void muestraTodosResultados(){
        System.out.println("Num1="+Double.toString(num1)+" Num2=" + Double.toString(num2));
        System.out.println("Suma :" + Double.toString(num1+num2));
        System.out.println("Resta :"+ Double.toString(num1-num2));
        System.out.println("Multiplica :" + Double.toString(num1*num2));
        System.out.println("Divide :"+ Double.toString(num1/num2));
        System.out.println("Raiz:"+Integer.toString(num1,1/num2));
        System.out.println("Potencia:" +Integer.toString(base,exp));
        System.out.println("Logaritmo : " +Double.toString(Math.log10(num1)));
        System.out.println("Factorial:" +Integer.toString(factorial));
    }*/
}

