package ejercicioFiguraGeometrica;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Rectangle extends Figure {

    public Rectangle() throws IOException {
        this.setSide1(this.validation(1));
        this.setSide2(this.validation(2));
    }
}
