import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 12:32
 */
public class ArrayListContain {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("world");
        /*ArrayList arrayList1=new ArrayList();
        System.out.println(drop1(arrayList, arrayList1));
        System.out.println("---------------");*/
        drop2(arrayList);
        System.out.println(arrayList);
    }
    //去重方式1,新建一个列表，来存储新的集合
    public static ArrayList drop1(ArrayList srcArrayList, ArrayList targetArrayList){
        Iterator iterator=srcArrayList.iterator();
        while (iterator.hasNext()){
            String s=(String) iterator.next();
            if(!targetArrayList.contains(s)){
                targetArrayList.add(s);
            }
        }
        return targetArrayList;
    }
    //去重方式2,通过选择排序的方式，在原集合上进行处理
    public static void drop2(ArrayList arrayList){
        for (int i = 0; i <arrayList.size()-1 ; i++) {
            for (int j = i+1; j <arrayList.size() ; j++) {
                if(arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                    //因为集合长度随之改变，所以要使其下标减1，重新计算
                    j--;
                    System.out.println(arrayList.size());
                }
            }
        }
    }
}
