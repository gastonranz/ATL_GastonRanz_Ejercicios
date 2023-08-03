package ejercicioFiguraGeometrica;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Figure rectangle = new Rectangle();
        rectangle.calcularAreaRectangulo();

        FiguraGeometrica circle = new Circle();
        circle.calcularAreaCirculo();*/

        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);

    }
}