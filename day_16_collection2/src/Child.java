/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/27
 * 15:23
 */
public class Child extends Parent<String> {
    @Override
    public void getT(String s) {
        System.out.println("this is a child");
    }

    public static void main(String[] args) {
        Parent parent=new Child();
        parent.getT("1");
    }

}
