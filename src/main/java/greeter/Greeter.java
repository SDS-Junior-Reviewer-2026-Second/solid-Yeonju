package greeter;

public class Greeter {
    private final GreetingStrategy strategy;

    public Greeter(GreetingStrategy strategy) {
        this.strategy = strategy;
    }

    public String greet() {
        return strategy.greet();
    }
}
