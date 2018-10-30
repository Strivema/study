package designPattern.FactoryPattrn;

/**
 * @athour Marie
 * @date 2018/10/30 2:54 PM
 **/
public class FactoryTest {
    //简单工程模式以及静态工厂模式
    public static void main(String []args){
        HumanFactory humanFactory = new HumanFactory();
        Human male = humanFactory.createHuman("male");
        Male male1 = HumanFactory.createMale();
        male.beat();
        male.eat();
        male.sleep();
        male1.beat();
        male1.eat();;
        male1.sleep();
    }

}
