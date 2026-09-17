package greeter;

public class IntimateGreetingStrategy implements GreetingStrategy {
    @Override
    public String greet() {
        return "Hello Darling!";
    }
}
