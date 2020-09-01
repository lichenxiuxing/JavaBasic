package zhouYang;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/8
 * 18:33
 * 1,原因，多个线程操作同一资源,引发ConcurrentModificationException
 * 2,解决方法，使用CopyOnWriteArrayList
 */
public class ListExceptionTest {
    public static void main(String[] args) {
        noSafeHashMap();
    }

    private static void noSafeHashMap() {
        Map<String,String> map = new ConcurrentHashMap<>();
        for (int i = 0; i <= 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0, 8));
                System.out.println(map);
            }, String.valueOf(i)).start();
        }
    }

    private static void noSafeSet() {
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i <= 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(set);
            }, String.valueOf(i)).start();
        }
    }

    private static void noSafeList() {
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i <= 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
