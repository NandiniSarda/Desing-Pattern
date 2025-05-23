package Creational.Factory;

import Creational.Factory.Components.*;

public class IosUiFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public TextFeild createTextField() {
        return new IosTextField();
    }
}
