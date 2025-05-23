package Factory;

//import java.awt.*;

import Factory.Components.Button;
import Factory.Components.TextFeild;

public abstract class Platform {
    public abstract UIComponentFactory createUiFactory();
}
