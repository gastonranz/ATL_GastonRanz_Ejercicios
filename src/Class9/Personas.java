package Class9;

import java.util.Scanner;

public class Personas {
    public static void main(String[] args) {
        String[] personas = {"Gaston Ranz", "Lucas Moy", "Leonel Ranz", "Leandro Ranz", "Kim Wilde"};
        System.out.println("Escribe la persona que desea buscar:");
        String input = new Scanner(System.in).nextLine();

        for (int i = 0; i < personas.length; i++) {
            String finalPerson = personas[i];
            if (finalPerson.toLowerCase().contains(input.toLowerCase())) {
                System.out.println("The person is " + finalPerson);
            }
        }

        //for each
        for(String people : personas) {
            if(people.toLowerCase().contains(input.toLowerCase())) {
                System.out.println("The person is: " + people);
            }
        }
    }
}
