package Class12;
//Armar un programa para organizar un "amigo invisible": Este programa debe permitir a los
//participantes ingresar sus nombres. Luego, cada participante debe sentarse frente a la
//computadora, escribir su nombre y recibir una indicación sobre a quién debe darle un regalo. El
//programa también debe limpiar la consola después de que cada participante haya visto su
//indicación.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AmigoInvisible {
    public static void main(String[] args) throws IOException {
        System.out.println();
    }
       /* System.out.println("Ingrese la cantidad de personas (puede ingresar hasta 10 personas): ");
        String text = AmigoInvisible.keyboardScanner();
        String[] personas = new String[Integer.parseInt(text)];
        String[] elegido = new String[Integer.parseInt(text)];

        List<Integer> present = new ArrayList<>();

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Participante " + (i + 1) + ", escribe tu nombre.");
            personas[i] = AmigoInvisible.keyboardScanner();
        }

        System.out.println("Ahora voy a llamar a cada persona, la persona debe estar sola y va a ser informada sobre" +
                " su amigo/a a quien tiene que enviar de manera anónima su obsequio.");

        for(int i = 0; i < personas.length; i++) {
            AmigoInvisible.playerSelection(personas, elegido);
        }
        elegido.add(AmigoInvisible.playerSelection(personas, elegido));
        present.add(AmigoInvisible.present(personas, present, elegido));


        for (String people : personas) {
            System.out.println(people);
        }
    }

    private static String keyboardScanner() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        return buffer.readLine();
    }

    private static Integer playerSelection(String[] personas, List<Integer> elegido) {
        boolean match = true;
        int number = 0;
        int num = (int) (Math.random() * 10);

        while (num >= personas.length) {
            num = (int) (Math.random() * 10);
        }


            while (match == true) {
                for (int i = 0; i < personas.length; i++) {
                    if (elegido.get(i) == num) {
                        number++;
                    }
                }
                if (number == 0) {
                    match = false;
                } else {
                    num = (int) (Math.random() * 10);
                    while (num >= personas.length) {
                        num = (int) (Math.random() * 10);
                    }
                    number = 0;
                }
            }


        System.out.println(personas[num] + " Tienes que sentarte al fentre de la computadora.");
        return num;
    }

    private static Integer[] present(String[] personas, List<Integer> present, List<Integer> elegido) {
        Integer[] personas2 = new Integer[personas.length];
        boolean match = true;
        int number = 0;

        for(int i = 0; i < personas2.length; i++) {
            int num = (int) (Math.random() * 10);

            while (num >= personas2.length) {
                num = (int) (Math.random() * 10);
            }

                while (match == true) {
                    for (int i = 0; i < personas2.length; i++) {
                        if (personas2[i] == num) {
                            number++;
                        }
                    }
                    if (number == 0) {
                        match = false;
                    } else {
                        num = (int) (Math.random() * 10);
                        while (num >= personas.length) {
                            num = (int) (Math.random() * 10);
                        }
                        number = 0;
                    }
                }
            personas2[i] = num;
        }




        //System.out.println("Tienes que obsequiarle a tu amigo/a: " + personas[num]);
        return personas2;
    }
    */
}
