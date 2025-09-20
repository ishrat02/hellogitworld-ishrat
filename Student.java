public class Student{
    String name;
    int id;
    public Student(){}
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }

    public static void main(String[] args){
        Student student =new Student("Ishrat",2107019);
        Student student1=new Student();
        student1.setName("Onik");
        student1.setId(2107016);
        System.out.println(student.getName()+" "+student.getId());
        System.out.println(student1.getName()+" "+student1.getId());
    }
}