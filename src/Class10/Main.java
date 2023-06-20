package Class10;

import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Persona persona1 = new Persona("93829824", "Gastón Ranz", 28, new Date(), "38503823");
        System.out.println(persona1.toString());
        persona1.isAnAdult();
        System.out.println();

        Cuenta cuentaPersona1 = new Cuenta(persona1);
        System.out.println(cuentaPersona1);
        cuentaPersona1.ingresar(1000d);
        System.out.println(cuentaPersona1);
        cuentaPersona1.retirar(500.50);
        System.out.println(cuentaPersona1);
    }
}