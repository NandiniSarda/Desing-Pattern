package Factory.Components;

public class IosTextField implements TextFeild{
    @Override
    public void render() {
        System.out.println("ios render textfeild");
    }

    @Override
    public void onChange() {
        System.out.println("ios onchnage textfeild");
    }
}
