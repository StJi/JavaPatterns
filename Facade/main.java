public class main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        System.out.println(facade.pr(1, "Black").getName());
        System.out.println(facade.pr(2, "Cappucchino").getName());
    }
}
