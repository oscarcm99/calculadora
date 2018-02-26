/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Calculadora
{
    // instance variables - replace the example below with your own
    private int num1;
    private int num2;
    private int rdo;
    private int indice,radicando,base,exp;
    private float resultado;
    private Operacion op;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        num1 = 0;
        num2 = 0;
        op=op.SUMA;

    }

    public void ponNum1(int n1)
    {
        // put your code here
        this.num1=n1;
    }

    public void ponNum2(int n2)
    {
        // put your code here
        this.num2=n2;
    }
    public void PonRadicando(int radicando)
    {
        this.radicando=radicando; 
    }
    public void PonIndice(int indice)
    {
        this.indice=indice; 
    }
    public void PonBase(int base)
    {
        this.base=base;
    }
    public void PonExponente(int exp)
    {
        this.exp=exp;
    }
    public void opera()
    {
        switch(op){
            case SUMA:
                rdo=num1+num2;
                break;
            case RESTA:
                rdo=num1-num2;
                break;
            case MULTIPLICA:
                rdo=num1*num2;
                break;
            case DIVIDE:
                rdo=num1/num2;
                break;
            case RAICES:
                resultado = (float)Math.pow(radicando, 1/indice);
                break;
            case POTENCIAS:
                rdo = (int)Math.pow(base,exp);
                break;
            case FACTORIALES:
                long factorial=1;
                for(int i = num1; i> 0; i--){
                factorial = factorial *i;
                }
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
            case "FACTORIALES":
                op=op.FACTORIALES;
                break;
        }
    }
    public int dameResultado()
    {
        // devuelve un resultado de tipo entero
        return rdo;
    }
    public float resultadoReal()
    {
       //devuelve un resultado de tipo float
        return resultado;   
    }
    public void muestraTodosResultados(){
        System.out.println("Num1="+Integer.toString(num1)+" Num2=" + Integer.toString(num2));
        System.out.println("Suma :" + Integer.toString(num1+num2));
        System.out.println("Resta :"+ Integer.toString(num1-num2));
        System.out.println("Multiplica :" + Integer.toString(num1*num2));
        System.out.println("Divide :"+ Integer.toString(num1/num2));
        System.out.println("Raiz:"+ Integer.toString(radicando,1/indice));
        System.out.println("Potencia:" +Integer.toString(base,exp));
        System.out.println("Factorial:" +Integer.toString(num1));
    }
}
