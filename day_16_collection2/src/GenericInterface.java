/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 15:26
 */
class  GenericInterface <T> implements Inter <T> {
    //泛型接口的使用，一般实现了该接口的类也是泛型类
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
class GDemo{
    public static void main(String[] args) {
        GenericInterface<String> genericInterface=new GenericInterface();
        genericInterface.show("hello");
    }

}
