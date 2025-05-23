package Creational.Factory;

public class Android extends Platform {

    @Override
    public UIComponentFactory createUiFactory() {
        return new AndoroidUiFactory();
    }
}
