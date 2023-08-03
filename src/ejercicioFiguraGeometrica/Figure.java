package ejercicioFiguraGeometrica;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public abstract class Figure implements FiguraGeometrica {
    private float side1;
    private float side2;

    protected float getSide1() {
        return this.side1;
    }

    protected void setSide1(Float side1) {
        this.side1 = side1;
    }

    protected float getSide2() {
        return this.side2;
    }

    protected void setSide2(float side2) {
        this.side2 = side2;
    }

    protected float validation(int data) throws IOException {
        switch (data) {
            case 1: System.out.println("Please, type the size of the rectangle 1st side:");
                break;
            case 2: System.out.println("Please, type the size of the rectangle 2nd side:");
                break;
            default: System.out.println("Please, type the size of your Circle:");
        }

        float num = this.dataScanner();
        while (num <= 0) {
            if(num == 0) {
                System.out.println("Please, type a bigger number than \"0\"!:");
            } else {
                System.out.println("Please, type a positive number!:");
            }
            num = this.dataScanner();
        }
        return num;
    }

    @Override
    public void calcularAreaRectangulo() {
        System.out.println("The Area of your Rectangle is: " + this.side1 * this.side2);
    }

    @Override
    public void calcularAreaCirculo() {
        System.out.println("The Area of your Circle is: " + (float) Math.PI * (this.side1 * this.side1));
    }

    protected Float dataScanner() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        return Float.parseFloat(strNum);
    }
}
