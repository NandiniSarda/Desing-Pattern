package Structural.Decorator;

public class ChocolateSyrup implements  IceCream{
    IceCream iceCream ;
    public ChocolateSyrup(IceCream iceCream)
    {
        this.iceCream=iceCream;
    }
    @Override
    public int getcost() {
        return iceCream.getcost()+10;
    }

    @Override
    public void getdesc() {
        iceCream.getdesc();
        System.out.print("+ Chocolate syrup");
    }
}
