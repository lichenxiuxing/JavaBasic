package design_model.factoryMethod;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 16:27
 */
public class CatFactory implements Factory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
