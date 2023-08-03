package Class13;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Figure {
    private Float side1;
    private Float side2;
    private Float side3;

    protected Float getSide1() {
        return this.side1;
    }

    protected void setSide1(Float side1) {
        this.side1 = side1;
    }

    protected Float getSide2() {
        return this.side2;
    }

    protected void setSide2(Float side2) {
        this.side2 = side2;
    }

    protected Float getSide3() {
        return this.side3;
    }

    protected void setSide3(Float side3) {
        this.side3 = side3;
    }

    protected Float floatNumberScanner() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        return Float.parseFloat(strNum);
    }

    protected Integer integerNumberScanner() throws IOException {
        return Math.round(this.floatNumberScanner());
    }
}