package design_model.simpleFactory;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
 * 16:06
 */
public class AnimalDemo {
    public static void main(String[] args) {
        /*Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();*/
        /*简单工厂模式改进1
        Dog dog = AnimalFactory.getDog();
        Cat cat = AnimalFactory.getCat();
        dog.eat();
        cat.eat();*/
        //简单工厂模式改进之应用多态
        //缺点：当新加动物时，需要修改此类，不符合修改-扩展原则
        Animal dog = AnimalFactory.getAnimal("dog");
        Animal cat = AnimalFactory.getAnimal("cat");
        dog.eat();
        cat.eat();
    }
}
