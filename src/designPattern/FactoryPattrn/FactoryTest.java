package designPattern.FactoryPattrn;

/**
 * @athour Marie
 * @date 2018/10/30 2:54 PM
 **/
public class FactoryTest {
    public static void main(String []args){
        HumanFactory humanFactory = new HumanFactory();
        Human male = humanFactory.createHuman("male");
        male.beat();
        male.eat();
        male.sleep();
    }

}
