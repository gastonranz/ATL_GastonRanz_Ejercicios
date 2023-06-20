package Class10;

import java.util.Scanner;

public class Cuenta {
    private Persona titular;
    private Double cantidad;

    public Cuenta(Persona titular, Double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(Persona titular) {
        this(titular, 0d);
    }

    public Persona getTitular() {
        return titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad() {

    }

    public void ingresar(Double money) {
        while(money <= 0) {
            if(money == 0) {
                System.out.println("Please, type a bigger number than \"0\":");
            } else {
                System.out.println("Please, type a positive number:");
            }
            money = this.numScanner();
        }
        System.out.println("---- The operation was successed ----\n--- Your saldo is: $" + money + " ---");
        this.cantidad += money;
    }

    public Double retirar(Double money) {
        while (money <= 0) {
            if(money == 0) {
                System.out.println("Please, type a bigger number than \"0\":");
            } else {
                System.out.println("Please, type a positive number!");
            }
            money = this.numScanner();
        }
        if(money <= this.cantidad) {
            cantidad -= money;
            System.out.println("Your operation was successed!\n--- Your saldo is: $" + this.cantidad + " ---");
        }
        return money;
    }

    private Double numScanner() {
        return new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular=" + titular +
                ", cantidad=" + cantidad +
                '}';
    }
}
