/**
 * Calculadora de 2 numeros que suma, resta, multiplica, divide, hace raices, logaritmos, factoriales y potencias.
 *
 * @author (Sergio Sanz, Oscar Calderon)
 * @version (calculadora 2.0)
 */

public class Calculadora
{
    // instance variables - replace the example below with your own
    private double num1;//Numeros reales
    private double num2;//Numeros reales
    private int factorial;//Para los factoriales que deben de ser numero entero
    private double resultado;//Resultado para la raiz
    private int rdo;//Resultado factoriales 
    private Operacion op; //Asociamos el enum creado en otra clase
    private int indice;
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // inicilizan variables
        num1 = 0;
        num2 = 0;
        factorial = 0;
        op=op.SUMA;

    }

    public void ponNum1(double n1)
    {
        // para llamada del num1
        this.num1=n1;
    }

    public void ponNum2(double n2)
    {
        // para llamada del num2
        this.num2=n2;
    }
    public void PonFactorial(int factorial){
        //Factorial que debe ser entero
        this.factorial=factorial;
    }
    public void opera()
    {
        switch(op){
            case SUMA://Operaciones suma
                resultado=num1+num2;
                break;
            case RESTA://Operaciones resta
                resultado=num1-num2;
                break;
            case MULTIPLICA://Operaciones multiplicaciones
                resultado=num1*num2;
                break;
            case DIVIDE://Operaciones division
                resultado= num1/num2;
                break;
            case RAICES://Operaciones raices no se puede meter base negativa segun esta definida en 
            //la funcion math.pow
                resultado = (double)Math.pow(num1,(double)1/num2); /*Asocia el resultado de la raiz al meter los numeros, un float que es el resultado que devuelve*/
                break;
            case POTENCIAS://Operaciones de potencias
                resultado = (double)Math.pow(num1,num2);
                break;
            case LOGARITMOS://Operaciones logaritmos en base 10
                resultado=Math.log10(num1);
                break;
            case FACTORIALES://Operaciones con factoriales que segun un entero diistinto a uno se 
            //multiplica el numero por el numero -1 asi hasta llegar a 1
                int a = 1;  
                while ( factorial!=1) {
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

