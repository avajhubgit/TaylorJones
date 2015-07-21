import java.util.Random;

class EggVoice extends Thread
{
    final Random random = new Random();
    @Override
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            try{
                //pause thread
                sleep(random.nextInt(600) + 100);
            }catch(InterruptedException e){}

            //on first iteration
            if (i == 0){
                if (TaylorJonesRun.whoStart == null)
                    TaylorJonesRun.whoStart = "The first is egg!";
            }
            System.out.println("egg!");
        }
    }
}