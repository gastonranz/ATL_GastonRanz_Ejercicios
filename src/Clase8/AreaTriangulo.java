package Clase8;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class AreaTriangulo {
    public static void main(String[] args) throws IOException {
        AreaTriangulo.programEjecution();
    }

    private static void programEjecution() throws IOException {
        String strSide1 = "side 1";
        String strSide2 = "side 2";
        String strSide3 = "side 3";

        System.out.println("Let's calculate the area of a Triangle!\nType the " + strSide1 + " of your Triangle:");
        Float side1 = AreaTriangulo.keyboardScanner();
        side1 = AreaTriangulo.numberValidation(side1, strSide1);
        System.out.println("Type the " + strSide2 + " of your Triangle:");
        Float side2 = AreaTriangulo.keyboardScanner();
        side2 = AreaTriangulo.numberValidation(side2, strSide2);
        System.out.println("Type the " + strSide3 + " of your Triangle:");
        Float side3 = AreaTriangulo.keyboardScanner();
        side3 = AreaTriangulo.numberValidation(side3, strSide3);

        System.out.println("Your Triangle square number is: " + (side1 * side2 * side3));
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
                side = AreaTriangulo.keyboardScanner();
                while (side < 0) {
                    System.out.println("Are you kidding me? C'mon, type a positive " + strSide + " number:");
                    side = AreaTriangulo.keyboardScanner();
                }
            } else {
                if (side == 0) {
                    System.out.println("Please, type a " + strSide + " number bigger than \"0\":");
                    side = AreaTriangulo.keyboardScanner();
                    while (side == 0) {
                        System.out.println("Are you kidding me? C'mon, type a " + strSide + " number bigger than \"0\":");
                        side = AreaTriangulo.keyboardScanner();
                    }
                }
            }
        }
        return side;
    }
}
