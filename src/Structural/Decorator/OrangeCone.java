package Structural.Decorator;

public class OrangeCone implements  IceCream{
    IceCream iceCream ;
    public OrangeCone(){}
    public OrangeCone(IceCream iceCream)
    {
        this.iceCream=iceCream;
    }
    @Override
    public int getcost() {
        if (iceCream !=null)
        {
            return iceCream.getcost()+3;
        }
        return 3;
    }

    @Override
    public void getdesc() {
        if (iceCream !=null)
        {
            iceCream.getdesc();
            System.out.print("+ Orange Cone");
        }
        else System.out.print("Orange Cone");
    }
}
