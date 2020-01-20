package test;

import father.Father;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 15:16
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        //不同包下的其他类只能访问public方法
        father.show3();
    }
}
