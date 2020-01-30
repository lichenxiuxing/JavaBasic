package lichen.dao;

import lichen.pojo.User;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 22:05
 */
public interface UserDao {
    boolean isLogin(String userName,String passWord);
    void regist(User user);
}
