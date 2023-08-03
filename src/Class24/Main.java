package Class24;

public class Main {
    public static void main(String[] args) {
        Object object;
        Animal animal;
        Bird bird;
        Fish fish;
        BetaFish betaFish;
        Passer passer;
        Duck duck;
        betaFish = Main.betaFishInstance();
        passer = Main.passerInstance();
        duck = Main.duckInstance();

        fish = betaFish;
        object = duck;
        animal = passer;
        animal = duck;
        animal = betaFish;
        bird = duck;
        bird = passer;
        object = animal;

        System.out.println("BetaFish = " + betaFish);
        System.out.println("Fish = " + new Duck("Donald"));
        System.out.println("Passer = " + new Passer("Hunter"));

        Flying flying = new Passer("a");
        Swimmer swimmer = new Duck("a");
    }

    public static Passer passerInstance() {
        return new Passer("Gorrion");
    }

    public static Duck duckInstance() {
        return new Duck("Donald");
    }

    public static BetaFish betaFishInstance() {
        BetaFish betaFish = new BetaFish("Nemo");
        return betaFish;
    }
}
