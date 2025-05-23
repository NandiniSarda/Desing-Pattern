package Factory;

import Factory.Components.AndroidButton;
import Factory.Components.AndroidTextField;
import Factory.Components.Button;
import Factory.Components.TextFeild;

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
