public class ObserverStation {
    private String name;
    private float temperature=0;
    private float pressure=0;
    private float humidity=0;
    public ObserverStation(String name) {
        this.name = name;
    }

    public void update(float temperature, float pressure, float humidity) {

        if( Math.abs(this.temperature-temperature)>=1 || Math.abs(this.pressure-pressure)>=1 || (Math.abs(this.humidity-humidity)>=1)){
            String res="";
            res="\n ---------------------\n"+name;
            if(Math.abs(this.temperature-temperature)>=1){
                this.temperature=temperature;
                res+="\n Температура = "+ Float.toString(temperature);
            }
            if(Math.abs(this.pressure-pressure)>=1){
                this.pressure=pressure;
                res+="\n Давление = "+ Float.toString(pressure);
            }
            if(Math.abs(this.humidity-humidity)>=1){
                this.humidity=humidity;
                res+="\n Влажность = "+ Float.toString(humidity);
            }
            System.out.println(res);
        }

    }
}