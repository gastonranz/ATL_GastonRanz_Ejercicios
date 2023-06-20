package Clase8;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class AreaCuadrado {
    public static void main(String[] args) throws IOException {
        AreaCuadrado.programEjecution();
    }

    private static void programEjecution() throws IOException {
        String strHeight = "height";
        String strWidth = "width";

        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);

        System.out.println("Let's calculate the area of a square!\nType the height of the square (alto):");
        Float height = AreaCuadrado.keyboardScanner();
        height = AreaCuadrado.numberValidation(height, strHeight);
        System.out.println("Now, type the width of the square (ancho):");
        Float width = AreaCuadrado.keyboardScanner();
        width = AreaCuadrado.numberValidation(width, strWidth);

        System.out.println("The area of your square is: " + (height * width));
    }

    private static Float keyboardScanner() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        return Float.parseFloat(strNum);
    }

    private static Float numberValidation(Float side, String strSide) throws IOException {
        while (side <= 0) {
            if (side < 0) {
                System.out.println("Please, type a positive " + strSide + " number:");
                side = AreaCuadrado.keyboardScanner();
                while (side < 0) {
                    System.out.println("Are you kidding me? C'mon, type a positive " + strSide + " number:");
                    side = AreaCuadrado.keyboardScanner();
                }
            } else {
                if (side == 0) {
                    System.out.println("Please, type a " + strSide + " number bigger than \"0\":");
                    side = AreaCuadrado.keyboardScanner();
                    while (side == 0) {
                        System.out.println("Are you kidding me? C'mon, type a " + strSide + " number bigger than \"0\":");
                        side = AreaCuadrado.keyboardScanner();
                    }
                }
            }
        }
        return side;
    }
}
