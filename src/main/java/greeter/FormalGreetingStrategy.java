package greeter;

public class FormalGreetingStrategy implements GreetingStrategy {
    @Override
    public String greet() {
        return "Good evening, sir.";
    }
}
