import java.util.ArrayList;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 16:24
 * 集合的嵌套循环
 */
public class QianTaoArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> bigArrayList=new ArrayList<>();
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("11");
        arrayList1.add("12");
        arrayList1.add("13");
        bigArrayList.add(arrayList1);
        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList1.add("21");
        arrayList1.add("22");
        arrayList1.add("23");
        bigArrayList.add(arrayList2);
        ArrayList<String> arrayList3=new ArrayList<>();
        arrayList1.add("31");
        arrayList1.add("32");
        arrayList1.add("33");
        bigArrayList.add(arrayList3);
        for (ArrayList<String> smallList : bigArrayList) {
            for (String s : smallList) {
                System.out.println(s);
            }
        }
    }
}
