package greeter;

public class CasualGreetingStrategy implements GreetingStrategy {
    @Override
    public String greet() {
        return "Sup bro?";
    }
}
