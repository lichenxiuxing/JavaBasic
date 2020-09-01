package ZY_mianshi;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/10
 * 11:21
 */
//验证内存可见性
public class VotileYanZheng {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.setT60();

        },"A").start();

        while (resource.num == 0) {
                //可见性不能保证时，会一直循环。
        }
        System.out.println(Thread.currentThread().getName());

    }
}
class Resource {
    //不加volatile时，主内存不会收到修改。
    public int num = 0;
    public void setT60() {
        this.num = 60;
    }
}
