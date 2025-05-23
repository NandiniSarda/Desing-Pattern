package Factory;

import Factory.Components.Button;
import Factory.Components.TextFeild;

//abstract factory
public interface UIComponentFactory {
    public abstract Button createButton();
    public abstract TextFeild createTextField();
}
