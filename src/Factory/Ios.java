package Factory;

import Factory.Components.Button;
import Factory.Components.IosButton;
import Factory.Components.IosTextField;
import Factory.Components.TextFeild;

public class Ios extends Platform{

    @Override
    public UIComponentFactory createUiFactory() {
        return new IosUiFactory();
    }
}
