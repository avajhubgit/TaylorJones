import java.util.Random;

public class Wolf extends Thread
{
    final Random random = new Random();
      
    @Override
    public void run()
    {
        synchronized (TaylorJonesRun.mutex) {
            
            try{
                //pause thread
                sleep(random.nextInt(600) + 100);
            }catch(InterruptedException e){}
            
            System.out.println("Waiting for RedHat...");
            try {
                TaylorJonesRun.mutex.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // continue execution and eating
            System.out.println("Nom-Nom...");
        }
    }
}