package Factory;

import Factory.Components.AndroidButton;
import Factory.Components.AndroidTextField;
import Factory.Components.Button;
import Factory.Components.TextFeild;
import Factory.Platform;

public class Android extends Platform {

    @Override
    public UIComponentFactory createUiFactory() {
        return new AndoroidUiFactory();
    }
}
