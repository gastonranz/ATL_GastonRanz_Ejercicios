package Class24;

public class Passer extends Bird {
    protected Passer(String name) {
        super(name);
    }

    @Override
    public void toFlap() {
        System.out.println("I'm start flying!!");
    }

    @Override
    public void toGlide() {
        System.out.println("Now I'm enjoying this flight!");
    }

    @Override
    public String toString() {
        return "Passer{" +
                "name='" + name + '\'' +
                '}';
    }
}
