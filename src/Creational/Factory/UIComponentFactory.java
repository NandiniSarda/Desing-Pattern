package Creational.Factory;

import Creational.Factory.Components.Button;
import Creational.Factory.Components.TextFeild;

//abstract factory
public interface UIComponentFactory {
    public abstract Button createButton();
    public abstract TextFeild createTextField();
}
