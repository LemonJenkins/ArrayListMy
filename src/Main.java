import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyList list = new MyListImpl();
        list.add(55);
        System.out.println(list.get(0));
        System.out.println(list.toArray()[0]);
        String ss = "123456 8";
        char[] f = ss.toCharArray();
        System.out.println(f.length);

    }
}
