package Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateSyrup(new Cherry(new OrangeCone(new ChocolateCone())));
        System.out.println( iceCream.getcost());
        iceCream.getdesc();
    }
}
