package Factory;

//practical factory
public class PlatformFactory {
    public static Platform createPlatform(String str)
    {
        if (str.equalsIgnoreCase("Android")) return new Android();
        else if (str.equalsIgnoreCase("IOS")) return  new Ios();
        else return null;
    }

}
