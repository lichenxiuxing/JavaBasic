import java.util.Objects;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 20:37
 */
public class OverrideStudent {
    int a=1;
    String string="null";

    @Override
    public String toString() {
        return "OverrideStudent{" +
                "a=" + a +
                ", string='" + string + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OverrideStudent that = (OverrideStudent) o;
        return a == that.a &&
                string.equals(that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, string);
    }
}
