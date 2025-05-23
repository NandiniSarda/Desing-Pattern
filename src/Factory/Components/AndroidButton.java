package Factory.Components;

public class AndroidButton implements Button{
    @Override
    public void render() {
        System.out.println("rendering Android button");
    }

    @Override
    public void onclick() {
        System.out.println("onclick android button");
    }
}
