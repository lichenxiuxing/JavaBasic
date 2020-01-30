package lichen.daoImpl;

import lichen.dao.UserDao;
import lichen.pojo.User;

import java.util.ArrayList;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 22:06
 */
public class UserDaoImpl implements UserDao {
    private ArrayList<User> arrayList=new ArrayList<>();

    @Override
    public boolean isLogin(String userName, String passWord) {
        boolean flag = false;
        for (User user : arrayList) {
            if(user.getPassWord().equals(passWord)
                    &&user.getUserName().equals(userName
            )){
                flag=true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void regist(User user) {
        arrayList.add(user);
    }
}
