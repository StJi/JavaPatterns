public abstract class maker {
    public static equipment factory(int select){
        if (select==1)  return new TeaMachine();
        if (select==2) return new CoffeMachine();
        throw new RuntimeException("Оборудование не найдено");
    }
}
