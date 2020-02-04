/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 17:17
 */
public class Person {
    public int age;
    private String name;
    String address;
    public Person(){

    }
    private Person(int age){
        this.age=age;
    }
    public void method(){
        System.out.println("method");
    }
    public void method(int i){
        System.out.println(i);
    }
    private void show(String s){
        System.out.println(s);
    }
    public int test(int i,int j){
        return i+j;
    }
    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
