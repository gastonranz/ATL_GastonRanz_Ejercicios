package Class9;

import java.util.Scanner;

public class Personas {
    public static void main(String[] args) {
        String[] personas = {"Gaston Ranz", "Lucas Moy", "Leonel Ranz", "Leandro Ranz", "Kim Wilde"};
        System.out.println("Escribe la persona que desea buscar:");
        String persona = new Scanner(System.in).nextLine();

        for (int i = 0; i < personas.length; i++) {
            String numbrePersona1 = personas[i];
            if (persona.equals(numbrePersona1)) {
                System.out.println(numbrePersona1);
            }
        }

        /*int num = 3;
        int num2 = 5;
        int result = 0;
        int result2 = 0;

        for(int i = 0; i < 1000; i++) {
            result += num * i;
        }

        for(int i = 0; i < 1000; i++) {
            result2 += num2 * i;
        }

        System.out.println(result + result2);
    }*/
    }
}
