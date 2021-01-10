import java.util.Scanner;

public class Show {
    private static String name;
    private static int number;

    public void test(){
        System.out.println("我是非静态方法");
    }

    //注意:静态方法中不能用this和super关键字,静态方法不能使用非静态方法或变量（因为静态方法/变量不属于这个类，它会随着类加载而加载）
    public static void main(String[] args) {
//        test();  //会报错

        Scanner input=new Scanner(System.in);  //新建输入库
        System.out.println("请输入学生姓名：");
        name=input.next();                      //接收输入值
        System.out.println("请输入联系方式的：");
        number=input.nextInt();

        //实例化student类，然后赋值它继承User的变量
        Student stu = new Student(name,number);
        stu.setId(100010);
        stu.setPass("123456");

        //输出
        System.out.println("账号是"+stu.getId());
        System.out.println("密码是"+stu.getPass());
        System.out.println("学生姓名"+stu.getName());
        System.out.println("联系方式"+stu.getNumber());

    }
}
