package Class12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeCambio {
    public static void main(String[] args) throws IOException {
        CalculadoraDeCambio.runProgram();
    }

    private static void runProgram() throws IOException {
        System.out.println("Vamos a calcular tu cambio de tu producto:");
        System.out.println("Type your product name:");
        String product = CalculadoraDeCambio.inputStr();
        System.out.println("Type the product price:");
        Float productPice = CalculadoraDeCambio.input();
        System.out.println("Now type your cash:");
        Float cash = CalculadoraDeCambio.input();

        CalculadoraDeCambio.calculo(productPice, cash, product);
    }

    private static Float input() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        Float num = Float.parseFloat(strNum);

        while(num <= 0) {
            if(num == 0) {
                System.out.println("Please, type a number bigger than 0:");
                strNum = buffer.readLine();
                num = Float.parseFloat(strNum);
            } else {
                System.out.println("Please, type a positive number:");
                strNum = buffer.readLine();
                num = Float.parseFloat(strNum);
            }
        }
        return num;
    }

    private static String inputStr() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String product = buffer.readLine();

        while(product.equalsIgnoreCase("null")) {
            System.out.println("Please, don't type a null value, type anothe value:");
            product = buffer.readLine();
        }
        return product;
    }

    private static void calculo(Float valorProd, Float cash, String product) throws IOException {
        Float result = 0f;

        if(cash >= valorProd) {
            System.out.println("Congratulation, you've got a new item!\n-----TICKET-----\nProduct: " + product + "\n" +
                    "Product price: $" + valorProd + "\nTotal: $" + (valorProd) + "\nYour purchase: $" + cash + "\n" +
                    "Your change: $" + (cash - valorProd));
        } else {
            System.out.println("You don't have enough cash, stranger.");
        }
        CalculadoraDeCambio.reiteracion();
    }

    private static void reiteracion() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        System.out.println("Press 1 to run this program again, 0 to quit:");
        String strNum = buffer.readLine();
        Float num = Float.parseFloat(strNum);

        while(num < 0 || num > 1) {
            if(num < 0) {
                System.out.println("Please, don't use a negative number, type 1 to run this program again, 0 to quit:");
                strNum = buffer.readLine();
                num = Float.parseFloat(strNum);
            } else {
                System.out.println("Please, don't use a number bigger than 1, type 1 to run this program again," +
                        " 0 to quit:");
                strNum = buffer.readLine();
                num = Float.parseFloat(strNum);
            }
        }

        if(num == 1) {
            CalculadoraDeCambio.runProgram();
        } else {
            System.out.println("--- Thank you for using this program! ---");
        }
    }
}
