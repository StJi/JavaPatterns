abstract class Truck {
    int axis;
    String engine;
    String body;
    String name;
    boolean typical= true;

    public Truck( int axis, String engine, String body, String name){
        this.axis=axis;
        this.engine=engine;
        this.body=body;
        this.name=name;
    }

    protected Truck(){}

    public int getAxis(){return this.axis;}
    public String getBody(){return this.body;}
    public String getName(){return this.name;}

    public boolean isTypical() {
        return typical;
    }

    public String toString(){
        String res="";
        res+="Грузовик "+name+" "+Integer.toString(axis)+"-осевой, "+ engine+" ";
        if (!typical) res+="\n Нуждается в согласовании";
        return res;
    }
}
