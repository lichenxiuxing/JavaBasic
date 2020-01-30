package lichen.test;

import lichen.dao.UserDao;
import lichen.daoImpl.UserDaoImpl;
import lichen.pojo.User;

import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 22:10
 */
public class UserTest {
    public static void main(String[] args) {
        System.out.println("===========首页===========");
        System.out.println("请输入您的选择");
        System.out.println("1：注册");
        System.out.println("2：登录");
        System.out.println("3：退出");
        Scanner scanner = new Scanner(System.in);
        UserDao userDaoImpl = new UserDaoImpl();
        while (true) {
            switch (scanner.next()) {
                case ("1"):
                    System.out.println("==========注册页面============");
                    User user = new User();
                    System.out.println("请输入用户名");
                    String userName = scanner.next();
                    user.setUserName(userName);
                    System.out.println("请输入密码");
                    String passWord = scanner.next();
                    user.setPassWord(passWord);
                    userDaoImpl.regist(user);
                    break;
                case ("2"):
                    System.out.println("============登录页面=============");
                    System.out.println("请输入用户名");
                    String name = scanner.next();
                    System.out.println("请输入密码");
                    String password = scanner.next();
                    if(userDaoImpl.isLogin(name,password)){
                        System.out.println("登录成功，是否退出，y/n");
                        String s=scanner.nextLine();
                        if(s.equals("y")){
                            System.out.println("欢迎下次光临");
                            System.exit(0);
                        }else {
                            break;
                        }
                    }else {
                        System.out.println("您的账号或密码有误");
                    }
                    break;
                case ("3"):
                default:
                    System.out.println("您已退出");
                    System.exit(0);
            }
        }
    }
}
