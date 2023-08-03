package Class24;

public class BetaFish extends Fish {
    protected BetaFish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + this.getName() + '\'' +
                '}';
    }


    @Override
    public void swim() {
        System.out.println("Look! I'm swimming as a fish does!");
    }
}
