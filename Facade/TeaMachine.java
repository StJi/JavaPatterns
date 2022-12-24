public class TeaMachine implements equipment {
    @Override
    public product make(String name) {
        return new tea(name);
    }
}