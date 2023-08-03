package Class13;

import org.w3c.dom.css.Rect;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    // Crea una clase base llamada "Figura" con métodos para calcular el área y el perímetro de una figura geométrica
    // genérica. Luego, crea clases derivadas como "Triangulo", "Cuadrado" y "Circulo", que hereden de la clase base
    // y sobreescriban los métodos para calcular el área y el perímetro según su forma específica. Crea instancias de
    // las diferentes figuras y muestra sus áreas y perímetros.
    public static void main(String[] args) throws IOException {
        Main.figureValidation();
    }

    private static void figureValidation() throws IOException {
        Integer num2 = 0;
        String word;
        boolean value = false;
        while(value == false) {
            System.out.println("Please choice your Figure:\n" +
                "Type 1 to select a Square:\n" +
                "Type 2 to select a Rectangle:\n" +
                "Type 3 to select a Triangle:\n" +
                "Type 4 to select a Circle:");
            Float num = Main.numberScanner();
            num2 = Math.round(num);

            switch(num2) {
                case 1: word = "Square";
                    break;
                case 2: word = "Rectangle";
                    break;
                case 3: word = "Triangle";
                    break;
                case 4: word = "Circle";
                    break;
                default: System.out.println("Select a number between 1 & 4:\n");
            }

            if(num2 > 0 && num2 < 5) {
                value = true;
            }

        }

        switch(num2) {
            case 1: Square square = new Square();
            break;
            case 2: Rectangle rectangle = new Rectangle();
            break;
            case 3: Triangle triangle = new Triangle();
            break;
            case 4: Circle circle = new Circle();
            break;
        }
    }

    private static Float numberScanner() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        return Float.parseFloat(strNum);
    }
}

