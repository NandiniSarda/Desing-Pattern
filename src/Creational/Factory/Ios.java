package Creational.Factory;

public class Ios extends Platform{

    @Override
    public UIComponentFactory createUiFactory() {
        return new IosUiFactory();
    }
}
