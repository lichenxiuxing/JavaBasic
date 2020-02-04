package design_model.singleModel;

import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 16:56
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //Runtime是一个饿汉式的类
        Runtime runtime=Runtime.getRuntime();
        //exec()执行控制台命令
        runtime.exec("cmd");
        // runtime.exec("calc");
    }
}
