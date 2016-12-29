package practice;

import Char.Char;
import util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by G on 2016/12/20.
 */
public class Sum2Voice {

    public static final String []DANWEI = new String[]{"亿","千","百","十","万","千","百","十"};

    public static void main(String[] args) {
        String str = "12345";
        str = StringUtil.StringReverse(str);
        char[] str2charArray = new char[str.length()];
        str.getChars(0, str.length(), str2charArray,0 );
        List<Object> list = new ArrayList<Object>();
        int j = DANWEI.length-1;
        for(int i=  0; i < str2charArray.length ; i++){
            list.add(str2charArray[i]);
            list.add(DANWEI[j]);
            j--;
        }
        Collections.reverse(list);
        list.remove(0);
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }

    }


}
