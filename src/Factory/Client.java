package Factory;

import Factory.Components.Button;
import Factory.Components.TextFeild;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        Platform platform = new Android();
//        platform.createButton().render();
//        platform.createTextField().render();
//
//        platform = new IOS();
//        platform.createButton().render();
//        platform.createTextField().render();

        System.out.println("Please Enter Platform");
        String platformName = new Scanner(System.in).nextLine();


//        Platform platform = null;
//        if (platform.equals("Android")) {
//            platform = new Android();
//        } else if (platform.equals("IOS")) {
//            platform = new IOS();
//        } else {
//            System.out.println("Invalid platform");
//            return;
//        }
            Platform platform=PlatformFactory.createPlatform(platformName);
            Button button = platform.createUiFactory().createButton();
            TextFeild textFeild = platform.createUiFactory().createTextField();
            button.render();
            button.onclick();
            textFeild.render();
            textFeild.onChange();


    }
}
