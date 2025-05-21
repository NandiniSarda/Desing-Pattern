package Singleton;

public class Singleton {
    private int num;
    private static volatile Singleton singleton;

    private  Singleton()
    {
        num=1;
    }
    public  static Singleton getInstance()
    {
        if (singleton==null)
        synchronized(Singleton.class){
            if (singleton==null)
                singleton= new Singleton();
        }
        return  singleton;
    }
}
