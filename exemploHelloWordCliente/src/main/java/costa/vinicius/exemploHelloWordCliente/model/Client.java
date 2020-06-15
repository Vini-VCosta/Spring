package costa.vinicius.exemploHelloWordCliente.model;

/**
 * @author Vinicius Costa
 * @since 09/06/2020 - 21:58
 * @version 1.0
 */
public class Client {

    protected String name;
    protected String lastname;
    protected double income;

    public Client() {
    }

    public Client(String name, String lastname, double income) {
        this.name = name;
        this.lastname = lastname;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    /**
     *
     * @return
     */
    public double calcularIncome(){
        return this.income * 1.10;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.name
             + "\nSobrenome: " +this.lastname
             + "\nRenda: " + this.income
             + "\nInsalubridade: "+calcularIncome();
    }
}
