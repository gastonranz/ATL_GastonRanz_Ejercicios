package ejercicioFiguraGeometrica;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Circle extends Figure {
    public Circle() throws IOException {
        this.setSide1(this.validation(3));
    }
}