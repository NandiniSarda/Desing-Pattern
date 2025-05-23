package Factory.Components;

public class AndroidTextField implements TextFeild {
    @Override
    public void render() {
        System.out.println("android render textfeild");
    }

    @Override
    public void onChange() {
        System.out.println("android onchnage textfeild");
    }
}