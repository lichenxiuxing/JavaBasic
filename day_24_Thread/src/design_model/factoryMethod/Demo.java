package design_model.factoryMethod;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 16:27
 * 为解决简单工厂模式的弊端
 * 工厂方法模式：当新加动物时，只需扩展两个类，一个动物类，一个工厂类，
 * 弊端：代码量增加
 */
public class Demo {
    public static void main(String[] args) {
        Factory f=new DogFactory();
        Animal dog=f.getAnimal();
        dog.eat();
        f=new CatFactory();
        Animal cat=f.getAnimal();
        cat.eat();

    }
}
