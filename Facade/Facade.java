public class Facade {
    public product pr(int type, String name){
        equipment eq=maker.factory(type);
        product pr = eq.make(name);
        if (pr instanceof tea){
            pr.addIngredient("black tea");
            pr.addIngredient("sugar");
        }
        if (pr instanceof coffe){
            pr.addIngredient("coffe");
            pr.addIngredient("sugar");
            pr.addIngredient("milk");
            pr.addIngredient("koritsa");
        }
        return pr;
    }
}
