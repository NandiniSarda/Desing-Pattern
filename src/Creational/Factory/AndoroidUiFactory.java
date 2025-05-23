package Creational.Factory;

import Creational.Factory.Components.AndroidButton;
import Creational.Factory.Components.AndroidTextField;
import Creational.Factory.Components.Button;
import Creational.Factory.Components.TextFeild;

public class AndoroidUiFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public TextFeild createTextField() {
        return new AndroidTextField();
    }
}
