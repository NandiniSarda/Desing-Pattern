package Structural.Decorator;

public class Cherry implements  IceCream{
    IceCream iceCream ;
    public Cherry(IceCream iceCream)
    {
        this.iceCream=iceCream;
    }
    @Override
    public int getcost() {
            return iceCream.getcost()+7;
    }

    @Override
    public void getdesc() {
            iceCream.getdesc();
            System.out.print("+ cherry");
    }
}
