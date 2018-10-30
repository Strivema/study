package designPattern.FactoryPattrn;

/**
 * @athour Marie
 * @date 2018/10/30 2:50 PM
 **/
public class Female implements Human{


    @Override
    public void eat() {
        System.out.println("female eating");
    }

    @Override
    public void sleep() {
        System.out.println("female sleeping");
    }

    @Override
    public void beat() {
        System.out.println("female beating");
    }
}
