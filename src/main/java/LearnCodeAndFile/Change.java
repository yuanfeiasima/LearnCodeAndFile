package LearnCodeAndFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangwentao on 2016/5/18.
 */
public class Change {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        List list = new ArrayList<Integer>();

        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list = null;
        System.out.println(list);
    }
}
