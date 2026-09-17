package greeter;

public class DefaultGreetingStrategy implements GreetingStrategy {
    @Override
    public String greet() {
        return "Hello.";
    }
}
