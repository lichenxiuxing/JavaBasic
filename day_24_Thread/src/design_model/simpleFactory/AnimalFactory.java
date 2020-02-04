package design_model.simpleFactory;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 16:06
 */
public class AnimalFactory {
    private AnimalFactory(){}
    /*简单工厂模式改进1
    public static Dog getDog(){
        return new Dog();
    }
    public static Cat getCat(){
        return new Cat();
    }*/
    //简单工厂模式改进之应用多态
    public static Animal getAnimal(String s){
        if(s.equals("dog")){
            return new Dog();
        }else if(s.equals("cat")){
            return new Cat();
        }else {
            return null;
        }
    }
}
