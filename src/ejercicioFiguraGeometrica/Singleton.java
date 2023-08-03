package ejercicioFiguraGeometrica;

public class Singleton {
    private static Singleton singleton;
    private final String name;

    private Singleton() {
        super();
        this.name = "Gastón";
    }

    public static Singleton getSingleton() {
        if(Singleton.singleton == null) {
            Singleton.singleton = new Singleton();
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
