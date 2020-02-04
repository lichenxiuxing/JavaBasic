package dynamicProxy;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 21:02
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void find() {
        System.out.println("find");
    }
}
