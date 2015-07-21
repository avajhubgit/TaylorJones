import java.util.Random;

public class RedHat extends Thread
{
    final Random random = new Random();
      
    @Override
    public void run()
    {
        try{
            //pause thread
            sleep(random.nextInt(600) + 100);
        }catch(InterruptedException e){}
                
        synchronized (TaylorJonesRun.mutex) {
            System.out.println("RedHat prepared");
            TaylorJonesRun.mutex.notifyAll();
        }
    }
}