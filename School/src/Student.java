public class Student extends User{
    int classNo;
    public Student(int id,String name,String surname,int age,int classNo){
        super(id,name,surname,age);
        this.classNo = classNo;
    }

    public int getClassNo(){
        return classNo;
    }

    public void setClassNo(int classNo){
        this.classNo = classNo;
    }
}
