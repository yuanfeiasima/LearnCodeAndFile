package practice;

/**
 * Created by G on 2017/1/19.
 */
public class ObjectVar {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Manager m1=new Manager(1,"谢东","人力资源部");
        Manager m2=new Manager(2,"李志","市场部");
        System.out.println("交换前");
        m1.display();
        m2.display();

        System.out.println("交换中");
        Manager.warpManage(m1, m2);

        System.out.println("交换后");
        m1.display();
        m2.display();
    }

}

class Manager{

    private int mid;
    private String mname;
    private String depart;


    public Manager(int m,String n,String d){
        this.mid=m;
        this.mname=n;
        this.depart=d;
    }

    public static void  warpManage(Manager m1,Manager m2){
        Manager temp=null;
        temp=m1;
        m1=m2;
        m2=temp;
        System.out.println("name１="+m1.mname+" depart１="+m1.depart);
        System.out.println("name２="+m2.mname+" depart２="+m2.depart);
    }

    public void display(){
        System.out.println("name="+this.mname+" depart="+this.depart);
    }
}
