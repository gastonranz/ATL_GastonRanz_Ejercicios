package Class24;

public class Duck extends Bird implements Swimmer {
    protected Duck(String name) {
        super(name);
    }

    @Override
    public void toFlap() {
        System.out.println("I'm flapping!");
    }

    @Override
    public void toGlide() {
        System.out.println("Look! I'm able to control the air with my winds!");
    }

    @Override
    public void swim() {
        System.out.println("Look! I'm swimming like a duck does!");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + this.getName() + '\'' +
                '}';
    }
}
