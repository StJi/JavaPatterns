import java.util.ArrayList;
import java.util.List;

public class coffe implements product{
    private final String name;
    private final List<String> ingredients;

    public coffe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    @Override
    public String getName() {
        StringBuilder builder = new StringBuilder();
        builder.append("Coffe ").append(name).append('[');
        for (String i : ingredients) {
            builder.append(i).append(',');
        }
        builder.append(']');

        return builder.toString();
    }

    @Override
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
}
