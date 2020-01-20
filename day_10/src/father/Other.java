package father;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 15:27
 */
public class Other {
    public static void main(String[] args) {
        //同一包下的其他类可以访问protected和public、default
        Father father = new Father();
        father.show1();
        father.show2();
        father.show3();
    }
}
