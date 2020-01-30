/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 13:43
 */
public class Generic {
    public static void main(String[] args) {
        GenericClass<String > genericClass=new GenericClass<>();
        genericClass.setS("hello");
        System.out.println(genericClass.s);
        System.out.println("============");
        GenericClass<Integer> genericClass1=new GenericClass<>();
        genericClass1.setS(1);
        System.out.println(genericClass1.s);
    }
}

class GenericClass<T> {
    public T s;

    public GenericClass() {
    }

    public GenericClass(T s) {
        this.s = s;
    }

    public void setS(T s) {
        this.s = s;
    }
}
