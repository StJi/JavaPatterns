public class CoffeMachine implements equipment {
    @Override
    public product make(String name) {
        return new coffe(name);
    }
}