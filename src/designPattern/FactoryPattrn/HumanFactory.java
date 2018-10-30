package designPattern.FactoryPattrn;

/**
 * @athour Marie
 * @date 2018/10/30 2:52 PM
 **/
public class HumanFactory {
    public Human createHuman(String gender){
        if(gender=="male")
            return new Male();
        else if (gender=="female")
            return new Female();
        else
            return null;
    }
}
