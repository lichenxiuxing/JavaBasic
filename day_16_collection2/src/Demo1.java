import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 16:31
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(random());
    }
    public static List<Integer> random(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (arrayList.size()<10){
            int random=(int) (Math.random()*20+1);
            if(!arrayList.contains(random)){
                arrayList.add(random);
            }
        }
        return arrayList;
    }
}
