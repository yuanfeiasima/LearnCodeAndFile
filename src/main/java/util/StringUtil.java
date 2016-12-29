package util;

/**
 * Created by G on 2016/12/29.
 */
public class StringUtil {
    public static String StringReverse (String str) {
        if (str == null || str.length() <=1){
            return str;
        }else {
            return StringReverse(str.substring(1)) + str.charAt(0);
        }
    }
}
