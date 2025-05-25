package Structural.Decorator;

public class ChocolateCone implements IceCream{
    IceCream iceCream ;
    public ChocolateCone(){}
    public ChocolateCone(IceCream iceCream)
    {
        this.iceCream=iceCream;
    }
    @Override
    public int getcost() {
        if (iceCream !=null)
        {
            return iceCream.getcost()+5;
        }
        return 5;
    }

    @Override
    public void getdesc() {
        if (iceCream !=null)
        {
            iceCream.getdesc();
            System.out.print("+ Chocolate Cone");
        }
        else System.out.print("Chocolate Cone");
    }
}
