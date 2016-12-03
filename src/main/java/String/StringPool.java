package String;

/**
 * Created by G on 2016/12/3.
 */
public class StringPool {

    /**
     * 常量池存在与永久代中(jvm方法区)
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "ab" + "cd";
        String str2 = "abcd";
        /**
         * true
         * 由于常量的值在编译的时候就被确定(优化)了。
         * 在这里，"ab"和"cd"都是常量，因此变量str3的值在编译时就可以确定。
         * 这行代码编译后的效果等同于： String str3 = "abcd";
         */
        System.out.println("str1 == str2:" + (str1 == str2));

        /**
         * 在常量池创建a，然后返回a的引用给s1
         */
        String s1 = "a";
        String s11 = new String("a");
        System.out.println("s1 == s11 : " + (s1 == s11));//false
        /**
         * 编译时确定s2的值
         */
        String s2 = "a" + "b";

        /**
         * 在常量池查找a ，然后调用stringbuilder.append 连接 s1的值
         * 在堆中新建实例
         */
        String s3 = "a" + s1;
        System.out.println("s2 == s3 : " + (s2 == s3));//false

        /**
         * intern方法将字符串对象（new创建的）加入到常量池
         */
        String s4 = s11.intern();
        System.out.println("s4 == s1 :" + (s4 == s1)); //true

        String ss1 = "Programming";
        String ss2 = new String("Programming");
        String ss3 = "Program" + "ming";
        System.out.println(ss1 == ss2);
        System.out.println(ss1 == ss3);
        System.out.println(ss1 == ss1.intern());
    }
}
