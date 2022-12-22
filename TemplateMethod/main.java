import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Конструкток");
        System.out.println("Выберите количество осей(1,2,3): ");
        int axis = in.nextInt();
        System.out.println("Выберите тип двигателя(бензиновый, дизельный): ");
        String engine = in.next();
        System.out.println("Выберите тип кузова (самосвал, тентованный, открытый): ");
        String body=in.next();
        System.out.println("Выберите производителя (Пример: Scania, Man, Valve):  ");
        String name=in.next();
        Truck choise;
        if(axis==1 && engine.equalsIgnoreCase("дизельный") && body.equalsIgnoreCase("открытый") && name.equalsIgnoreCase("Valve")){
            choise=new model1();
        }
        else if(axis==2 && engine.equalsIgnoreCase("бензиновый") && body.equalsIgnoreCase("самосвал") && name.equalsIgnoreCase("Man")){
            choise=new model2();
        }
        else if(axis==3 && engine.equalsIgnoreCase("дизельный") && body.equalsIgnoreCase("тентованный") && name.equalsIgnoreCase("Scania")){
            choise=new model3();
        }
        else
            choise= new nontypical(axis,engine,body,name);
        System.out.println("");
        System.out.println("Ваш выбор:");
        System.out.println(choise.toString());
    }
}
