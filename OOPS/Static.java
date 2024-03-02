package OOPS;

public class Static {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.schoolname="Pu";
        Student1 s2=new Student1();
        Student1 s3=new Student1();
        s3.schoolname="Christ";
        System.out.println(s1.schoolname);
    }
}
class Student1{
    String name;
    int roll;
    static String schoolname;
    void  setName(String name)
    {
        this.name=name;
    }
    String  getName(){
        return this.name;
    }
}

