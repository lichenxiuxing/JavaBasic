/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/19
 * 多态的使用，通过建立父类对象来统一调用子类方法，这样，在以后扩展新的子类时
 * 可以仍然通过调用工具类（工具类无需修改）即可
 * 11:35
 */
public class DuoTai {
    public static void main(String[] args) {
        //测试多态
        Animal animal = new Cat();
        AnimalTool.eat(animal);
        AnimalTool.sleep(animal);
        Animal animal1 = new Dog();
        AnimalTool.eat(animal1);
        AnimalTool.sleep(animal1);
        //测试向下转型
        Dog dog = (Dog) animal1;
        dog.run();
    }
}

class Animal {
    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("dog stand sleep");
    }

    public void run() {
        System.out.println("only dog can run");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("cat lie sleep");
    }
}

class AnimalTool {
    //构造方法私有,不允许外界创建对象来使用
    private AnimalTool() {
    }

    //将方法全部设为静态
    public static void eat(Animal animal) {
        animal.eat();
    }

    public static void sleep(Animal animal) {
        animal.sleep();
    }
}