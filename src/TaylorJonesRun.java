public class TaylorJonesRun{
    //for non-cashed variable
    public static volatile String whoStart;
    //for syncronized treads
    public static Object mutex = new Object();
    
    public static void main(String[] args)
    {
        System.out.println("*****************Part 1. The egg and the chicken********************");
        ChickenVoice chicken = new ChickenVoice();
        EggVoice egg = new EggVoice();
        System.out.println("The dispute started...");
        chicken.start();
        egg.start();
        
        //chicken is still cackling
        if(chicken.isAlive())
        {
            try{
                chicken.join();	//main thread wait chicken
            }catch(InterruptedException e){}
        }
        
        //egg is still talking
        if(egg.isAlive())
        {
            try{
                egg.join(); //main thread wait egg
            }catch(InterruptedException e){}
        }
        
        System.out.println(whoStart);
        System.out.println("The dispute is over!");

        System.out.println("*****************Part 2. The wolf and RedHat********************");
        RedHat rh = new RedHat();
        Wolf wolf = new Wolf();
        System.out.println("The pies are baked...");
        rh.start();
        wolf.start();
    }
}