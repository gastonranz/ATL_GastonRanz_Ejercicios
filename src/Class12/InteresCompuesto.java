package Class12;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        runProgram();
        //Float result = (capitalInicial + adicionAnual + ((capitalInicial + adicionAnual) * tasaInteres / 100)) * years;
    }

    private static void runProgram() {
        System.out.println("--- Este programa permite calcular tu interés compuesto ---\nEscribe tu capital inicial:");
        Float capitalInicial = InteresCompuesto.inputFloat();
        System.out.println("Escribe tu Adición Anual:");
        Float adicionAnual = InteresCompuesto.inputFloat(); //5000
        System.out.println("Escribe la Tasa de Interés:");
        Float tasaInteres = InteresCompuesto.inputFloat();
        System.out.println("Escribe la cantidad de años:");
        Integer years = InteresCompuesto.inputInteger();

        Float result = capitalInicial;

        for(int i = 0; i < years; i++) {
            result += adicionAnual;
            result +=  result * tasaInteres / 100;
        }
        System.out.println("Tu interés compuesto es: " + result + "\n");
        InteresCompuesto.reiteration();
    }

    private static Float inputFloat() {
        Scanner input = new Scanner(System.in);
        Float num = input.nextFloat();

        while(num < 0) {
            System.out.println("Please, type a Positive Number!:");
            num = input.nextFloat();
        }
        return num;
    }

    private static Integer inputInteger() {
        Scanner input = new Scanner(System.in);
        Integer num = input.nextInt();

        while(num < 0) {
            System.out.println("Please, type a Positive Number!:");
            num = input.nextInt();
        }
        return num;
    }

    private static void reiteration() {
        System.out.println("--- Press 1 to run this program again, 0 to quit: ---");
        Integer num = InteresCompuesto.inputInteger();

        while(num < 0 || num > 1) {
            if(num < 0) {
                System.out.println("Please, don't use a negative number, type 1 to run this program again, 0 to quit:");
                num = InteresCompuesto.inputInteger();
            } else {
                System.out.println("Please, don't use a number bigger than 1, type 1 to run this program again," +
                        " 0 to quit:");
                num = InteresCompuesto.inputInteger();
            }
        }

        if(num == 1) {
            InteresCompuesto.runProgram();
        } else {
            System.out.println("--- Thank you for using this program! ---");
        }
    }
}
