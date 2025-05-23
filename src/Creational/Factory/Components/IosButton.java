package Creational.Factory.Components;

public class IosButton implements Button{
    @Override
    public void render() {
        System.out.println("ios render button");
    }

    @Override
    public void onclick() {
        System.out.println("ios onclick button");
    }
}
