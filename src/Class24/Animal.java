package Class24;

public abstract class Animal {

    protected String name;

    protected Animal(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        } else {
            System.out.println("Please don't type a null value!");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
