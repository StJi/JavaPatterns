public class main {
    public static void main( String[] args){
        meteoStation station=new meteoStation();
        Updater upd=new Updater(station);
        ObserverStation obs1=new ObserverStation("obs1");
        ObserverStation obs2=new ObserverStation("obs2");

        station.subscribe(obs1);
        station.subscribe(obs2);
        station.unsubscribe(obs1);
        upd.run();
    }
}
