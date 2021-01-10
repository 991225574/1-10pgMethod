public class Student extends User{
    private String name;
    private int number;

    //构造方法 赋值给变量
    public Student(String name,int number){
        this.name=name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

}
