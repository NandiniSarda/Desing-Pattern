package Factory;

import Factory.Components.*;

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
