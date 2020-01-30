import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/27
 * 1:48
 */
public class PokerDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] strings = {"♠", "红桃", "■", "♣"};
        String[] strings1 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String string : strings) {
            for (String s : strings1) {
                list.add(string.concat(s));
            }
        }
        list.add("大王");
        list.add("小王");

        //洗牌
        Collections.shuffle(list);
        System.out.println(list);
        List<String> zs = new ArrayList<>();
        List<String> ls = new ArrayList<>();
        List<String> wu = new ArrayList<>();
        List<String> dipai = new ArrayList<>();
        //发牌
        for (int i = 0; i < list.size(); i++) {
            if (i >= list.size() - 3) {
                dipai.add(list.get(i));
            } else if (i % 3 == 0) {
                zs.add(list.get(i));
            } else if (i % 3 == 1) {
                ls.add(list.get(i));
            } else if(i % 3 == 2) {
                wu.add(list.get(i));
            }
        }
        System.out.println(zs);
        System.out.println(ls);
        System.out.println(wu);
        System.out.println(dipai);
    }


}

