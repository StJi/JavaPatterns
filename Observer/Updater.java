public class Updater extends Thread
{
    private meteoStation station;

    public Updater(meteoStation station)
    {
        this.station = station;
    }

    @Override
    public void run()
    {
        while(true)
        {
            try {
                sleep(2000);
            } catch (InterruptedException e) {}

            station.updateData();
        }
    }
}