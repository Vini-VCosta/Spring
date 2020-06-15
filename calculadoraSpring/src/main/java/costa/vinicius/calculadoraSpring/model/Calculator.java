package costa.vinicius.calculadoraSpring.model;

/**
 * @author Vinicius Costa
 * @since 09/06/2020 - 23:04
 * @version 1.0
 */
public class Calculator {

    protected double number1;
    protected double number2;

    public Calculator() {
    }

    /**
     *
     * @param number1
     * @param number2
     */
    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    /**
     *
     * @return Retorna um metodo que soma os dois numeros
     */
    public double addition(){
        return this.number1 + number2;
    }

    /**
     *
     * @return Retorna um metodo que subtrai os dois numeros
     */
    public double subtraction(){
        return this.number1 - number2;
    }

    /**
     *
     * @return Retorna um metodo que mutiplica os dois numeros
     */
    public double multiplication(){
        return this.number1 * number2;
    }

    /**
     *
     * @return Retorna um metodo que divide os dois numeros
     */
    public double division(){
        return this.number1 / number2;
    }

    @Override
    public String toString() {
        return "\nNumero 1: " + number1
             + "\nNumero 2:" + number2
             + "\nSoma: "+addition()
             + "\nSubtração: "+subtraction()
             + "\nMultiplicação: "+multiplication()
             + "\nDivisão: "+division();
    }
}
