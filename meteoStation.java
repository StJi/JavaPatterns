import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class meteoStation {
    private float temperature;
    private float pressure;
    private float humidity;

    private List<ObserverStation> observers = new ArrayList<>();

    private Random rnd = new Random();

    public void subscribe(ObserverStation o) {
        observers.add(o);
    }

    public void unsubscribe(ObserverStation o) {
        observers.remove(o);
    }

    public void updateData() {
        temperature = rnd.nextFloat()*3;
        pressure = rnd.nextFloat()*3;
        humidity = rnd.nextFloat()*3;
        notifyObservers();
    }

    public void notifyObservers() {
        for (ObserverStation observer:
                observers) {
            observer.update(temperature, pressure, humidity);
        }
    }
}