package designPattern.FactoryPattrn;

/**
 * @athour Marie
 * @date 2018/10/30 2:48 PM
 **/
public class Male implements Human{

    @Override
    public void eat() {
        System.out.println("male eating");
    }

    @Override
    public void sleep() {
        System.out.println("male sleeping");

    }

    @Override
    public void beat() {
        System.out.println("male beating");
    }
}
